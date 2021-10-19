package za.ac.cput.repository;
/**
 PackageRepositoryTest.java
 Repository: PackageRepositoryTest
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Package;
import za.ac.cput.factory.PackageFactory;
import za.ac.cput.repository.impl.IPackageRepository;

import static org.junit.jupiter.api.Assertions.*;

/*public class PackageRepositoryTest {
    private static IPackageRepository packageRepository = PackageRepository.getPackageRepository();
    private static Package aPackage = PackageFactory.createPackage(015, 025,
            8, 350.00,
            "Mega Package");

    @Test
    void getPackageRepository() {
    }

    @Test
    void create() {
        Package aPackage1 = packageRepository.create(packageRepository.create(aPackage));
        assertEquals(aPackage.getPackageID(), aPackage.getPackageID());
        System.out.println("\nCreated: " + aPackage);
    }

    @Test
    void read() {
        Package read = packageRepository.read(aPackage.getPackageID());
        assertNotNull(read);
        System.out.println("\nRead:\n" + read.toString());
    }

    @Test
    void update() {
        Package aPackage1 = new Package.Builder().copy(aPackage).setPackageID(015).
                setMembershipID(025).setHoursPerWeek(8).setPrice(350.00).
                setPackageName("Medium Package").build();
        aPackage1 = packageRepository.update(aPackage1);
        System.out.println("\nUpdated: " + aPackage1);
    }

    @Test
    void delete() {
        boolean deleteSuccessful = packageRepository.delete(aPackage.getPackageID());
        assertTrue(deleteSuccessful);
    }

    @Test
    void getAll() {
       // assertEquals(1,packageRepository.getAll().size());
        System.out.println("\nDisplay All: " + packageRepository.getAll());
    }

 */