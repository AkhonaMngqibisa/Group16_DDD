/* MedicalStaffFactory.java
 * Factory for the MedicalStaff entity
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 11 June 2021
 */

package za.ac.cput.factory;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.util.GenericHelper;

public class MedicalStaffFactory
{
    public static MedicalStaff createMedicalStaff(String fName, String lName, String email, String phoneNumber)
    {
        int medicalStaffID = GenericHelper.generateId();

        return new MedicalStaff.Builder(medicalStaffID)
                .setFirstName(fName)
                .setLastName(lName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}