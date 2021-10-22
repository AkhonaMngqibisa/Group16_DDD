package za.ac.cput.service.impl;

/* Admin.java
AdmninServiceTest for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminServicemplTest {

    private static AdminServicempl adminService;
    private static Admin admin = AdminFactory.creatAdmin("BONGISA", "MPAHLENI",
            "0781837656", "216205999@MYCPUT.AC.ZA");

    @Test
    void getAdminService() {
    }

    @Test
    void a_create() {

        Admin created = adminService.create(admin);
        assertEquals(admin.getID(), created.getID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    @Disabled
    void b_bread() {
        Admin read = adminService.read(admin.getID());
        System.out.println("\nRead:\n" + read);
    }

    @Test
    @Disabled
    void c_update() {

        Admin admin1 = new Admin.Builder().copy(admin).setPhoneNo("0781837656").build();
        admin1 = adminService.update(admin1);
        System.out.println("\nUpdated: " + admin1);
    }

    @Test
    @Disabled
    void d_delete() {

        boolean deleteSuccessful = adminService.delete(admin.getID());
        assertTrue(deleteSuccessful);
    }

    @Test
    @Disabled
    void getAll() { System.out.println("Display All: " + adminService.getAll()); }


}