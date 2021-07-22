/* MedicalStaffFactoryTest.java
 * Test MedicalStaffFactory
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 11 June 2021
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.MedicalStaff;

class MedicalStaffFactoryTest {

    @Test
    void createMedicalStaff() {
        MedicalStaff medicalStaff = MedicalStaffFactory.createMedicalStaff(
                "Jane", "Doe", "janedoe@email.com", "0123456789");
        System.out.println(medicalStaff);
    }
}