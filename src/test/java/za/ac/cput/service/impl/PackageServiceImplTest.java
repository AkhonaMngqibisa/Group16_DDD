package za.ac.cput.service.impl;
/**
 PackageServiceTest.java
 Service: PackageServiceTest
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 02 July 2021
 */


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Package;
import za.ac.cput.factory.PackageFactory;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class PackageServiceImplTest {
    @Autowired
    private static PackageServiceImpl packageServiceimp;
    private static Package aPackage = PackageFactory.createPackage(035, 005,
            "Super Mega Package");

    @Test
    void getPackageService() {
    }

    @Test
    void create() {
        Package created = packageServiceimp.create(aPackage);
        assertEquals(aPackage.getPackageID(), created.getPackageID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    @Disabled
    void read() {
        Package read = packageServiceimp.read(aPackage.getPackageID());
        System.out.println("\nRead:\n" + read);
    }

    @Test
    @Disabled
    void update() {
        Package aPackage1 = new Package.Builder().copy(aPackage).setPackageID(015).
                setMembershipID(025).setHoursPerWeek(8).setPrice(350.00).
                setPackageName("Medium Package").build();
        aPackage1 = packageServiceimp.update(aPackage1);
        System.out.println("\nUpdated: " + aPackage1);
    }

    @Test
    @Disabled
    void delete() {
        boolean deleteSuccessful = packageServiceimp.delete(aPackage.getPackageID());
        assertTrue(deleteSuccessful);
    }

    @Test
    @Disabled
    void getAll() {
        System.out.println("\nDisplay All: " + packageServiceimp.getAll());
    }
}