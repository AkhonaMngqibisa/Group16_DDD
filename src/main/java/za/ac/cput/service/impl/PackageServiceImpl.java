package za.ac.cput.service.impl;
/**
 ServiceRepositoryImpl.java
 Service: ServiceRepositoryImpl
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 29 July 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Package;
import za.ac.cput.repository.impl.IPackageRepository;
import java.util.stream.Collectors;

import java.util.Set;

@Service
public class PackageServiceImpl implements IPackageService{

    private static IPackageService iPackageService = null;
    @Autowired
    private IPackageRepository ipackageRepository;

    @Override
    public Package create(Package aPackage) {
        return this.ipackageRepository.save(aPackage);
    }

    @Override
    public Package read(Integer packageId) {
        return this.ipackageRepository.findById(packageId).orElse(null);
    }

    @Override
    public Package update(Package aPackage) {
        return this.ipackageRepository.save(aPackage);
    }

    @Override
    public boolean delete(Integer packageId) {
         this.ipackageRepository.deleteById(packageId);
        return !this.ipackageRepository.existsById(packageId);
    }

    @Override
    public Set<Package> getAll() {
        return this.ipackageRepository.findAll().stream().collect(Collectors.toSet());
    }
}
