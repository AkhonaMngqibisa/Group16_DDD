package za.ac.cput.factory;

import za.ac.cput.entity.Package;
import za.ac.cput.util.GenericHelper;

/**
 Factory: Package
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */


public class PackageFactory {
    public static Package createPackage(int hoursPerWeek, double price, String packageName) {
        int packageID = GenericHelper.generateId();
        Package aPackage = new Package.Builder().setPackageID(packageID)
                .setHoursPerWeek(hoursPerWeek)
                .setPrice(price).setPackageName(packageName).build();
        return aPackage;
    }

}

