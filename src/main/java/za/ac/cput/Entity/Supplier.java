package za.ac.cput.Entity;

/* Supplier.java
Entity for the Supplier
Author: Lilitha Moni (219068429)
Date: 10 June 2021
*/

public class Supplier {
    private int supId, eqId;
    private String supName;

    private Supplier(Builder builder) {
        this.supId = builder.supId;
        this.supName = builder.supName;
        this.eqId = builder.eqId;


    }

    @Override
    public String toString() {
        return "Supplier{" +
                "Supplier Id ='" + supId + '\'' +
                ", Name ='" + supName + '\'' +
                ", Equipment Id ='" + eqId + '\'' +
                '}';
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
