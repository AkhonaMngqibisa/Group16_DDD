package za.ac.cput.service.impl;

import za.ac.cput.entity.Supplier;
import za.ac.cput.repository.impl.SupplierRepository;
import java.util.Set;

/*
SupplierServiceImpl.java
Supplier service Implementation
Author: Lilitha Moni (219068429)
Date: 28 July 2021
*/


public class SupplierServiceImpl implements SupplierService {

    private static SupplierService SSupplier;
    private SupplierRepository suppRepository;

    public SupplierServiceImpl(SupplierRepository suppRepository) {
        this.suppRepository = suppRepository;
    }

    public SupplierServiceImpl() {
        this.suppRepository = SupplierRepository.getSuppRepository();

    }

    public static SupplierService getSupplierService() {

        if (SSupplier == null)
            SSupplier = new SupplierServiceImpl();
        return SSupplier;
    }

    @Override
    public Supplier create(Supplier supplier) {

        return this.suppRepository.create(supplier);
    }

    @Override
    public Supplier read(Integer suppID) {

        return this.suppRepository.read(suppID);
    }

    @Override
    public Supplier update(Supplier supplier) {

        return this.suppRepository.update(supplier);
    }

    @Override
    public boolean delete(Integer suppID) {

        return this.delete(suppID);
    }

    public Set<Supplier> getAll() {
        return this.suppRepository.getAll();
    }
}
