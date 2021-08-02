package za.ac.cput.repository.impl;

/* SupplierRepository.java
Class Repository for the Supplier
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import za.ac.cput.entity.Supplier;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepository implements ISupplierRepository {

    private static SupplierRepository suppRepository = null;
    private Set<Supplier> suppSet = null;

    private SupplierRepository() {
        suppSet = new HashSet<>();
    }

    public static SupplierRepository getSuppRepository() {
        if(suppRepository == null) {
            suppRepository = new SupplierRepository();
        }
        return suppRepository;
    }


    @Override
    public Supplier create(Supplier supp) {
        boolean add = suppSet.add(supp);
        if(add)
            return null;
        return supp;
    }

    @Override
    public Supplier read(Integer supplierID) {
        for (Supplier supp : suppSet)
            if (supp.getSupId() == supplierID) {
                return supp;
            }
        return null;
    }

    @Override
    public Supplier update(Supplier supp) {
        Supplier updated = read(supp.getSupId());
        if(updated != null) {
            suppSet.remove(updated);
            suppSet.add(supp);
            return supp;
        }
        return null;
    }


    @Override
    public boolean delete(Integer supplierID)
    {
        Supplier deleted = read(supplierID);
        if(deleted == null)
            return false;
        suppSet.remove(deleted);
        return true;
    }

    @Override
    public Set<Supplier> getAll() {
        return suppSet;
    }
}
