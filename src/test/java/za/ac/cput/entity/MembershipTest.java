/* MedicalStaffTestTest.java
 * Testing MedicalStaff
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 09 June 2021
 */

package za.ac.cput.entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MembershipTest {
    Membership m;

    @BeforeEach
    void setUp() {
        m = new Membership.Builder(17)
            .addMember(new Member.Builder().setFirstName("Ariana").setLastName("Grande").build())
            .setType("Gold")
            .setTotalFees(100.00)
            .build();
    }

    @Test
    void calculateTotalRenewal() {
        assertEquals(300.00, m.calculateTotalRenewal());
    }

    @Test
    void calculateTotalFees() {
        assertEquals(120, m.calculateTotalFees(20));
    }
}