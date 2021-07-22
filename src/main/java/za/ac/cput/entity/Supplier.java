package za.ac.cput.entity;

/* Supplier.java
Entity for the Supplier
Author: Lilitha Moni (219068429)
Date: 10 June 2021
*/

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private int supId, eqId;
    private String supName;
    List<Supplier> supplierList = new ArrayList<>();

    private Supplier(Builder builder) {
        this.supId = builder.supId;
        this.supName = builder.supName;
        this.eqId = builder.eqId;


    }

    public int getSupId() {
        return supId;
    }

    public String getSupName() {
        return supName;
    }

    public int getEqId() {
        return eqId;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "Supplier Id ='" + supId + '\'' +
                ", Name ='" + supName + '\'' +
                ", Equipment Id ='" + eqId + '\'' +
                ", Supplier List=" + supplierList +
                '}';
    }
    public List<Supplier> AddSupplier()
    {

        Supplier supplier = new Supplier(new Supplier.Builder());
        supplierList.add(supplier);


        return supplierList;
    }

    public List<Supplier> EditSupplier()
    {
        AddSupplier();
        for(int k = 0; k < 10; k++)
        {
            Supplier supplier = new Supplier(new Supplier.Builder());
            supplierList.contains(supplier);
        }
        return supplierList;
    }


    public static class Builder {
        private int supId,eqId;
        private String supName;

        public Builder setSupId(int supId) {
            this.supId = supId;
            return this;
        }

        public Builder setSupName(String supName) {
            this.supName = supName;
            return this;
        }

        public Builder setEqId(int eqId) {
            this.eqId = eqId;
            return this;
        }



        public Builder copy(Supplier supplier) {
            this.supId = supplier.supId;
            this.supName = supplier.supName;
            this.eqId = supplier.eqId;
            return this;
        }

        public Supplier build() {

            return new Supplier(this);
        }
    }
}
