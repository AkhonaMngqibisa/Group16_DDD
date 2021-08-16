package za.ac.cput.service.impl;

import za.ac.cput.entity.Gym;
import za.ac.cput.entity.Supplier;
import za.ac.cput.service.IService;

import java.util.Set;

/* SupplierService.java
Service for the Supplier
Author: Lilitha Moni (219068429)
Date: 28 July 2021
*/

public interface SupplierService extends IService<Supplier, Integer> {
    public Set<Supplier> getAll();
}