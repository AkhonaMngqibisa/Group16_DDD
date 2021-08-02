/* MembershipServiceImplTest.java
 * Test for Membership implementation
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 2 August 2021
 */

package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MembershipFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class MembershipServiceImplTest {
    public static MembershipServiceImpl membershipServiceImpl = (MembershipServiceImpl) MembershipServiceImpl.getInstance();
    public static Membership membership = MembershipFactory.createMembership(
            1,
            "silver",
            100.00
    );

    @Test
    void a_create() {
        Membership created = membershipServiceImpl.create(membership);
        assertEquals(created.getMembershipID(), membership.getMembershipID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Membership read = membershipServiceImpl.read(membership.getMembershipID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Membership updated = new Membership.Builder(membership).setType("gold").build();
        updated = membershipServiceImpl.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_getAll() {
        System.out.println("Display all\n-------\n" + membershipServiceImpl.getAll());
    }

    @Test
    void e_delete() {
        boolean deleted = membershipServiceImpl.delete(membership.getMembershipID());
        assertTrue(deleted);
        System.out.println("Delete: " + deleted);
    }
}