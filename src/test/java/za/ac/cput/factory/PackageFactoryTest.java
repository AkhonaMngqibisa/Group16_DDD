package za.ac.cput.factory;
/**
 FactoryTest: Package
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Package;


class PackageFactoryTest {

    @Test
    void createPackage() {
        Package aPackage = PackageFactory.createPackage(015, 025,
                "Mega Package");
        System.out.println(aPackage);

        assertTrue(aPackage instanceof Package);
    }
}