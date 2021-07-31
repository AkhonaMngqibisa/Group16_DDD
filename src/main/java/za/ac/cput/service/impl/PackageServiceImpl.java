package za.ac.cput.service.impl;
/**
 ServiceRepositoryImpl.java
 Service: ServiceRepositoryImpl
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 29 July 2021
 */

import za.ac.cput.entity.Package;
import za.ac.cput.repository.impl.PackageRepository;

import java.util.Set;

public class PackageServiceImpl implements IPackageService{

    public static IPackageService iPackageService = null;
    private PackageRepository packageRepository;

    public PackageServiceImpl() {
        this.packageRepository = (PackageRepository) PackageRepository.getPackageRepository();
    }

    public static IPackageService getPackageService(){
        if(iPackageService == null) {
            iPackageService = new PackageServiceImpl();
        }
        return iPackageService;
    }

    @Override
    public Package create(Package aPackage) {
        return this.packageRepository.create(aPackage);
    }

    @Override
    public Package read(Integer integer) {
        return this.packageRepository.read(integer);
    }

    @Override
    public Package update(Package aPackage) {
        return this.packageRepository.update(aPackage);
    }

    @Override
    public boolean delete(Integer integer) {
        return this.packageRepository.delete(integer);
    }

    @Override
    public Set<Package> getAll() {
        return this.packageRepository.getAll();
    }
}
