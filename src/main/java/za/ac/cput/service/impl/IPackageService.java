package za.ac.cput.service.impl;
/**
 IPackageService.java
 Service: IPackageService
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 29 July 2021
 */

import za.ac.cput.entity.Package;
import za.ac.cput.service.IService;

import java.util.Set;

public interface IPackageService extends IService<Package, Integer> {
    Set<Package> getAll();
}
