package za.ac.cput.Factory;
/**
 FactoryTest: Package
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Package;
import static org.junit.jupiter.api.Assertions.*;

class PackageFactoryTest {

    @Test
    void createPackage() {
        Package aPackage = PackageFactory.createPackage(015, 025,
                8, 350.00,
                "Mega Package");

        Assert.assertEquals(aPackage, aPackage);
    }
}