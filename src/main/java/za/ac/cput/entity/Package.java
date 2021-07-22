package za.ac.cput.entity;

import java.util.Objects;
/**
 Package.java
 Entity: Package
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 09 June 2021
 */

public class Package {
    private int packageID, membershipID, hoursPerWeek;
    private double price;
    private String packageName;

    private Package(Builder builder) {
        this.packageID = builder.packageID;
        this.membershipID = builder.membershipID;
        this.hoursPerWeek = builder.hoursPerWeek;
        this.price = builder.price;
        this.packageName = builder.packageName;
    }

    protected Package() {

    }

    public int getPackageID() {
        return packageID;
    }

    public int getMembershipID() {
        return membershipID;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public double getPrice() {
        return price;
    }

    public String getPackageName() {
        return packageName;
    }

    public void CanDoCheckUp(boolean checkUpCode) {
        /*
         * if checkUpCode allows
         * member to do checkup
         * then (true) member can do checkup
         * if not then (false)
         */
    }

    public void CanDoFitness(boolean fitnessCode) {
        /*
         * if fitnessCode allows
         * for fitness program then
         * can do (true) fitness if
         *  not then (false)
         */
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageID=" + packageID +
                ", membershipID=" + membershipID +
                ", hoursPerWeek=" + hoursPerWeek +
                ", price=" + price +
                ", packageName='" + packageName + '\'' +
                '}';
    }

    public static class Builder
    {
        private int packageID, membershipID, hoursPerWeek;
        private double price;
        private String packageName;

        public Builder setPackageID(int packageID) {
            this.packageID = packageID;
            return this;
        }


        public Builder setMembershipID(int membershipID) {
            this.membershipID = membershipID;
            return this;
        }


        public Builder setHoursPerWeek(int hoursPerWeek) {
            this.hoursPerWeek = hoursPerWeek;
            return this;
        }


        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = packageName;
            return this;

        }

        public Builder copy(Package p) {
            this.packageID = p.packageID;
            this.membershipID = p.membershipID;
            this.hoursPerWeek = p.hoursPerWeek;
            this.price = p.price;
            this.packageName = p.packageName;
            return this;
        }

        public Package build() {
            return new Package(this);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Package aPackage = (Package) o;
            return packageID == aPackage.packageID;
        }

        @Override
        public int hashCode() {
            return Objects.hash(packageID);
        }
    }
}

