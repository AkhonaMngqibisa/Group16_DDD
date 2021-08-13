package za.ac.cput.repository.impl;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminRespositoryTest {

    private static AdminRespository adminRepository = AdminRespository.getAdminRep();
    private static Admin admini = AdminFactory.creatAdmin("Bongisa ",
            "Mpahleni", "0781837656", "216205999@gmail.com");


    @Test
    void create() {

        Admin created = adminRepository.create(admini);
        assertEquals(created.getID(), admini.getID());
        System.out.println("Create\n---\n" + created + "---");

    }

    @Test
    void read() {

        Admin read = adminRepository.read(admini.getID());
        assertNotNull(read);
        System.out.println("\nRead\n---\n" + read + "---");
    }

    @Test
    void update() {

        Admin updated = new Admin.Builder().copy(admini).setFirstName("jACKSON").build();
        assertNotNull(admini.getFisrtName());
        System.out.println("Update: "+updated);
    }

    @Test
    void delete() {

        boolean delete = adminRepository.delete(admini.getID())  ;
        assertTrue(delete);
        System.out.println("Deleted Repository: "+delete);
    }

    @Test
    void getAll() {

        System.out.println(" Display the equipment");
        assertEquals(1,adminRepository.getAll().size());
        System.out.println(adminRepository.getAll());
    }
}