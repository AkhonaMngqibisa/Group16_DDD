/* MedicalStaffRepositoryTest.java
 * Class Repository Test for MeedicalStaff
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.factory.MedicalStaffFactory;
import za.ac.cput.repository.impl.MedicalStaffRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class MedicalStaffRepositoryTest {
    public static MedicalStaffRepository repository = MedicalStaffRepository.getRepository();
    public static MedicalStaff medicalStaff = MedicalStaffFactory.createMedicalStaff("James", "Bond", "jb@medistaff.co.za", "0729112358");

    @Test
    void a_create() {
        MedicalStaff created = repository.create(medicalStaff);
        assertEquals(created.getId(), medicalStaff.getId());
        System.out.println("Create\n---\n" + created + "---");
    }

    @Test
    void b_read() {
        MedicalStaff read = repository.read(medicalStaff.getId());
        assertNotNull(read);
        System.out.println("\nRead\n---\n" + read + "---");
    }

    @Test
    void c_update() {
        MedicalStaff updated = new MedicalStaff.Builder(medicalStaff).setLastName("Free").setEmail("jf@medistaff.co.za").build();
        assertNotNull(repository.update(updated));
        System.out.println("\nUpdated\n---\n" + updated + "---");
    }

    @Test
    void d_getAll() {
        System.out.println("\nShow all\n---\n");
        System.out.println(repository.getAll());
        System.out.println("---");
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(medicalStaff.getId());
        assertTrue(success);
        System.out.println("\nDelete: " + success);
    }
}