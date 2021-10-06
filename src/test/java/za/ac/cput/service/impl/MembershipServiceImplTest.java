/* MembershipServiceImplTest.java
 * Test for Membership implementation
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 2 August 2021
 */

package za.ac.cput.service.impl;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MemberFactory;
import za.ac.cput.factory.MembershipFactory;
import za.ac.cput.util.GenericHelper;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
class MembershipServiceImplTest {
    @Autowired
    public MemberServiceImpl memberServiceImpl;
    public static Member member;

    @Autowired
    public MembershipServiceImpl membershipServiceImpl;
    public static Membership membership = MembershipFactory.createMembership(
            new Member.Builder().setFirstName("Ariana").setLastName("Grande").build(),
            "silver",
            100.00
    );

    @BeforeAll
    void setup() {
        member = memberServiceImpl.create(
            MemberFactory.createMember(
                "Percy",
                "Jackson",
                "Camp Half Blood",
                "0123456789",
                16,
                "Taken",
                "pjackson@halfblood.com",
                "Annabeth"
            )
        );
        membership = MembershipFactory.createMembership(
                member,
                "silver",
                100.00
        );
        System.out.println("SETUP SUCCESSFUL");
    }

    @AfterAll
    void tearDown() {
        memberServiceImpl.delete(member.getMemberID());
        System.out.println("TEAR DOWN SUCCESSFUL");
    }

    @Test
    void a_create() {
        Membership created = membershipServiceImpl.create(membership);
        assertEquals(created.getID(), membership.getID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Membership read = membershipServiceImpl.read(membership.getID());
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
        boolean deleted = membershipServiceImpl.delete(membership.getID());
        assertTrue(deleted);
        System.out.println("Delete: " + deleted);
    }
}