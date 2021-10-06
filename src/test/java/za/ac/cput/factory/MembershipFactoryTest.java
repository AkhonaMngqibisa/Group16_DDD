/* MembershipFactoryTest.java
 * Test MembershipFactory
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 11 June 2021
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;

class MembershipFactoryTest {

    @Test
    void createMembership() {
        Membership membership = MembershipFactory.createMembership(
            new Member.Builder().setFirstName("Ariana").setLastName("Grande").build(),
            "Gold",
            300.00
        );
        System.out.println(membership);
    }
}