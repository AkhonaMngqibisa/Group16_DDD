package za.ac.cput.entity;
/* Equipment.java
Entity for the Equipment
Author: Lilitha Moni (219068429)
Date: 10 June 2021
*/
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="Equipment")
public class Equipment {
    @Id
    private int eqId;
    private String eqName, eqModel, eqInfo;


    private Equipment(Builder builder) {
        this.eqId = builder.eqId;
        this.eqName = builder.eqName;
        this.eqModel = builder.eqModel;
        this.eqInfo = builder.eqInfo;


    }

    public Equipment() {
    }

    public int getEqId() {
        return eqId;
    }

    public String getEqName() {
        return eqName;
    }

    public String getEqModel() {
        return eqModel;
    }

    public String getEqInfo() {
        return eqInfo;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "Equipment Id ='" + eqId + '\'' +
                ", Name ='" + eqName + '\'' +
                ", Model ='" + eqModel + '\'' +
                ", Info ='" + eqInfo + '\'' +
                '}';
    }


    public static class Builder {
        private int eqId;
        private String eqName, eqModel, eqInfo;

        public Builder setEqId(int eqId) {
            this.eqId = eqId;
            return this;
        }

        public Builder setEqName(String eqName) {
            this.eqName = eqName;
            return this;
        }

        public Builder setEqModel (String eqModel) {
            this.eqModel = eqModel;
            return this;
        }

        public Builder setEqInfo (String eqInfo) {
            this.eqInfo = eqInfo;
            return this;
        }



        public Builder copy(Equipment equipment) {
            this.eqId = equipment.eqId;
            this.eqName = equipment.eqName;
            this.eqModel = equipment.eqModel;
            this.eqInfo = equipment.eqInfo;
            return this;
        }

        public Equipment build() {

            return new Equipment(this);
        }
    }
}

