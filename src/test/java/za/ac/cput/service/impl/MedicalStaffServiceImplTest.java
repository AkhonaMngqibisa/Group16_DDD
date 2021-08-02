/* MedicalStaffServiceImplTest.java
 * Test for MedicalStaff implementation
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 2 August 2021
 */

package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.factory.MedicalStaffFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class MedicalStaffServiceImplTest {
    public static MedicalStaffServiceImpl medicalStaffServiceImpl = (MedicalStaffServiceImpl) MedicalStaffServiceImpl.getInstance();
    public static MedicalStaff medicalStaff = MedicalStaffFactory.createMedicalStaff(
            "Jack",
            "Frost",
            "jf@medistaff.co.za",
            "0213456789"
    );

    @Test
    void a_create() {
        MedicalStaff created = medicalStaffServiceImpl.create(medicalStaff);
        assertEquals(created.getId(), medicalStaff.getId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        MedicalStaff read = medicalStaffServiceImpl.read(medicalStaff.getId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        MedicalStaff updated = new MedicalStaff.Builder(medicalStaff).setLastName("Forrest").build();
        updated = medicalStaffServiceImpl.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_getAll() {
        System.out.println("Display all\n-------\n" + medicalStaffServiceImpl.getAll());
    }

    @Test
    void e_delete() {
        boolean deleted = medicalStaffServiceImpl.delete(medicalStaff.getId());
        assertTrue(deleted);
        System.out.println("Delete: " + deleted);
    }
}