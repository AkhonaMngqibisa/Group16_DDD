package za.ac.cput.repository;

/* SupplierRepository.java
Class Repository for the Supplier
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import za.ac.cput.entity.Supplier;

import java.util.ArrayList;
import java.util.List;

public class SupplierRepository implements ISupplierRepository {

    private static za.ac.cput.repository.SupplierRepository suppRepository = null;
    private List<Supplier> suppSet = null;

    private SupplierRepository() {
        suppSet = new ArrayList<>();
    }

    public static za.ac.cput.repository.SupplierRepository getSuppRepository() {
        if(suppRepository == null) {
            suppRepository = new za.ac.cput.repository.SupplierRepository();
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
    public List<Supplier> getAll() {
        return suppSet;
    }
}
