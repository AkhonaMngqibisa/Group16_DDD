package za.ac.cput.Factory;

import za.ac.cput.Entity.Supplier;
import za.ac.cput.Util.GenericHelper;

/* SupplierFactory.java
Factory for the Supplier
Author: Lilitha Moni (219068429)
Date: 11 June 2021
*/
public class SupplierFactory{

    public static Supplier createSupplier(String supName, int eqId){
        int supId = GenericHelper.generateId();
        Supplier supplier = new Supplier.Builder()
                .setSupId(supId)
                .setSupName(supName)
                .setEqId(eqId)
                .build();
        return supplier;
    }
}