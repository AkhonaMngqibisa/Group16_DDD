/* MembershipFactoryTest.java
 * Test MembershipFactory
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 11 June 2021
 */

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Membership;

class MembershipFactoryTest {

    @Test
    void createMembership() {
        Membership membership = MembershipFactory.createMembership(
                12, "Gold", 300.00);
        System.out.println(membership);
    }
}