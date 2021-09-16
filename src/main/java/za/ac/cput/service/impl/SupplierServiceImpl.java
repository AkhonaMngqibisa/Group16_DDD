package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Supplier;
import za.ac.cput.repository.impl.ISupplierRepository;
import java.util.Set;
import java.util.stream.Collectors;

/*
SupplierServiceImpl.java
Supplier service Implementation
Author: Lilitha Moni (219068429)
Date: 28 July 2021
*/

@Service
public class SupplierServiceImpl implements SupplierService {
    private static SupplierService supplierService= null;

    @Autowired
    private ISupplierRepository supplierRepository;

    @Override
    public Supplier create(Supplier supplier) {

        return this.supplierRepository.save(supplier);
    }

    @Override
    public Supplier read(Integer supId) {
        return this.supplierRepository.findById(supId).orElse(null);
    }

    @Override
    public Supplier update(Supplier supplier) {
        if(this.supplierRepository.existsById(supplier.getSupId()))
            return this.supplierRepository.save(supplier);
        return null;
    }

    @Override
    public boolean delete(Integer supId) {
        this.supplierRepository.deleteById(supId);
        if(this.supplierRepository.existsById(supId))
            return false;
        else

            return true;
    }

    @Override
    public Set<Supplier> getAll()
    {
        return this.supplierRepository.findAll().stream().collect(Collectors.toSet());
    }

}
