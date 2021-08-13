package za.ac.cput.service.impl;

/* Admin.java
AdmninServiceTest for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminServicemplTest {

    private static AdminServicempl adminServicempl = (AdminServicempl) AdminServicempl.getAdminService();
    private static Admin admin = AdminFactory.creatAdmin("BONGISA", "MPAHLENI",
            "0781837656", "216205999@MYCPUT.AC.ZA");

    @Test
    void getAdminService() {
    }

    @Test
    void create() {

        Admin created = adminServicempl.create(admin);
        assertEquals(admin.getID(), created.getID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    void read() {
        Admin read = adminServicempl.read(admin.getID());
        System.out.println("\nRead:\n" + read);
    }

    @Test
    void update() {

        Admin admin1 = new Admin.Builder().copy(admin).setPhoneNo("0781837656").build();
        admin1 = adminServicempl.update(admin1);
        System.out.println("\nUpdated: " + admin1);
    }

    @Test
    void delete() {

        boolean deleteSuccessful = adminServicempl.delete(admin.getID());
        assertTrue(deleteSuccessful);
    }

    @Test
    void getAll() { System.out.println("Display All: " + adminServicempl.getAll()); }


}