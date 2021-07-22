package za.ac.cput.factory;

import za.ac.cput.entity.Package;

/**
 Factory: Package
 @Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */


public class PackageFactory {
    public static Package createPackage(int packageID, int membershipID, int hoursPerWeek, double price, String packageName){
        return new Package.Builder().setPackageID(packageID)
                .setMembershipID(membershipID)
                .setHoursPerWeek(hoursPerWeek)
                .setPrice(price).setPackageName(packageName).build();
    }
}

