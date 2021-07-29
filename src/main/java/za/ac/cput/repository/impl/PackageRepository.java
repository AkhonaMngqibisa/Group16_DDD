package za.ac.cput.repository.impl;
/**
 PackageRepository.java
 Repository: PackageRepository
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import za.ac.cput.entity.Package;

import java.util.HashSet;
import java.util.Set;

public class PackageRepository implements IPackageRepository {
    private static PackageRepository packageRepository = null;
    private Set<Package> packageSet;

    private PackageRepository() {
        this.packageSet = new HashSet<>();
    }

    public static IPackageRepository getPackageRepository() {
        if (packageRepository == null) {
            packageRepository = new PackageRepository();
        }
        return new PackageRepository();
    }

    @Override
    public Package create(Package aPackage) {
        this.packageSet.add(aPackage);
        return aPackage;
    }

    @Override
    public Package read(Integer integer) {
        for (Package aPackage : this.packageSet) {
            return aPackage;
        }
        return null;
    }

    @Override
    public Package update(Package aPackage) {
        Package update = read(aPackage.getPackageID());
        if (update != null)
            this.packageSet.remove(update);
            this.packageSet.add(aPackage);
        return aPackage;
    }

    @Override
    public boolean delete(Integer integer) {
        Package aPackage = read(integer);
        if (aPackage != null) {
            this.packageSet.remove(aPackage);
            return true;
        } else {
            return false;
        }
    }
        @Override
        public Set<Package> getAll () {
            return this.packageSet;
        }
    }
