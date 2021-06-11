/* MedicalStaffFactory.java
 * Factory for the MedicalStaff entity
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 11 June 2021
 */

package za.ac.cput.Factory;
import za.ac.cput.Entity.MedicalStaff;
import za.ac.cput.Util.GenericHelper;

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