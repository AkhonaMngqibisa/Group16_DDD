package za.ac.cput.service.impl;
/**
 PackageServiceTest.java
 Service: PackageServiceTest
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 02 July 2021
 */


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Package;
import za.ac.cput.factory.PackageFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class PackageServiceImplTest {
    private static PackageServiceImpl packageServiceImpl = (PackageServiceImpl) PackageServiceImpl.getPackageService();
    private static Package aPackage = PackageFactory.createPackage(035, 005,
            4, 310.00,
            "Super Mega Package");

    @Test
    void getPackageService() {
    }

    @Test
    void create() {
        Package created = packageServiceImpl.create(aPackage);
        assertEquals(aPackage.getPackageID(), created.getPackageID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    void read() {
        Package read = packageServiceImpl.read(aPackage.getPackageID());
        System.out.println("\nRead:\n" + read);
    }

    @Test
    void update() {
        Package aPackage1 = new Package.Builder().copy(aPackage).setPackageID(015).
                setMembershipID(025).setHoursPerWeek(8).setPrice(350.00).
                setPackageName("Medium Package").build();
        aPackage1 = packageServiceImpl.update(aPackage1);
        System.out.println("\nUpdated: " + aPackage1);
    }

    @Test
    void delete() {
        boolean deleteSuccessful = packageServiceImpl.delete(aPackage.getPackageID());
        assertTrue(deleteSuccessful);
    }

    @Test
    void getAll() {
        System.out.println("\nDisplay All: " + packageServiceImpl.getAll());
    }
}