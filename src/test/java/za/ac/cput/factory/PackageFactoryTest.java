package za.ac.cput.factory;
/**
 FactoryTest: Package
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Package;


class PackageFactoryTest {

    @Test
    void createPackage() {
        Package aPackage = PackageFactory.createPackage(015, 025,
                8, 350.00,
                "Mega Package");

        assertEquals(aPackage, aPackage);
    }
}