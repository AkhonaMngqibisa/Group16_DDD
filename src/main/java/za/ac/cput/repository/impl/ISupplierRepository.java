package za.ac.cput.repository.impl;

/* ISuuplierRepository.java
Interface Repository for the Supplier
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Supplier;


@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, Integer>
{


}

