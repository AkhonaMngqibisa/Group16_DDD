package za.ac.cput.repository.impl;
/**
 IPackageRepository.java
 Repository: IPackageRepository
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import za.ac.cput.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPackageRepository extends JpaRepository<Package, Integer> {

}

