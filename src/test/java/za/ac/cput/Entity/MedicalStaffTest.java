/* MedicalStaffTestTest.java
 * Testing MedicalStaff
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 09 June 2021
 */

package za.ac.cput.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalStaffTest {
    private MedicalStaff ms;
    private Member m;

    @BeforeEach
    void setUp() {
        ms = new MedicalStaff.Builder(12)
                .setFirstName("Jane")
                .setLastName("Doe")
                .setPhoneNumber("0123456789")
                .setEmail("janedoe@email.com")
                .build();
        m = new Member.Builder()
            .setMemberID(12)
            .setFirstName("Jane")
            .setLastName("Doe")
            .setAge(32)
            .setStatus("Healthy")
            .build();
    }

    @Test
    void checkup() {
        System.out.println(ms.checkup(m, 70, 23.7, "No comment"));
        assertEquals(1, ms.getCheckupsDone());
    }

    @Test
    void fitnessTest() {
        assertTrue(ms.fitnessTest(m, 60, 8, 20));
        assertEquals(1, ms.getFitnessTestsDone());
        assertFalse(ms.fitnessTest(m, 40, 8, 20));
        assertEquals(2, ms.getFitnessTestsDone());
        assertFalse(ms.fitnessTest(m, 60, 8.7, 20));
        assertEquals(3, ms.getFitnessTestsDone());
        assertFalse(ms.fitnessTest(m, 65, 8, 16));
        assertEquals(4, ms.getFitnessTestsDone());
        assertFalse(ms.fitnessTest(m, 47, 9, 20));
        assertEquals(5, ms.getFitnessTestsDone());
        assertFalse(ms.fitnessTest(m, 60, 9.3, 12));
        assertEquals(6, ms.getFitnessTestsDone());
        assertFalse(ms.fitnessTest(m, 63, 4.2, 15));
        assertEquals(7, ms.getFitnessTestsDone());
    }

    @Test
    void testMedicalEmergencyMember() {
        System.out.println(ms.medicalEmergency(m, "Broke her index finger."));
        assertEquals(1, ms.getMedicalEmergenciesDone());
    }

    @Test
    void testMedicalEmergency() {
        System.out.println(ms.medicalEmergency("Broke her index finger."));
        assertEquals(1, ms.getMedicalEmergenciesDone());
    }
}