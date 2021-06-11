package za.ac.cput.Factory;

import za.ac.cput.Entity.Equipment;
import za.ac.cput.Util.GenericHelper;

/* EquipmentFactory.java
Factory for the Equipment
Author: Lilitha Moni (219068429)
Date: 11 June 2021
*/

    public class EquipmentFactory{

        public static Equipment createEquipment(String eqName, String eqModel, String eqInfo){
            int eqId = GenericHelper.generateId();
            Equipment equipment = new Equipment.Builder()
                    .setEqId(eqId)
                    .setEqName(eqName)
                    .setEqModel(eqModel)
                    .setEqInfo(eqInfo)
                    .build();
            return equipment;
        }
    }

