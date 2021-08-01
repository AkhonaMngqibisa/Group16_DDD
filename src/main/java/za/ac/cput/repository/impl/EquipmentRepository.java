package za.ac.cput.repository.impl;

/* EquipmentRepository.java
Class Repository for the Equipment
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import za.ac.cput.entity.Equipment;

import java.util.HashSet;
import java.util.Set;

public class EquipmentRepository implements IEquipmentRepository {

        private static EquipmentRepository equipmentRep = null;
        private Set<Equipment> equipmentSet = null;

        private EquipmentRepository() {
            equipmentSet = new HashSet<>();
        }

        public static EquipmentRepository getEquipmentRep() {
            if(equipmentRep == null) {
                equipmentRep = new EquipmentRepository();
            }
            return equipmentRep;
        }


    @Override
    public Equipment create(Equipment equipment) {
        boolean added = equipmentSet.add(equipment);
        if(added)
            return null;
        return equipment;
    }

    @Override
        public Equipment read(Integer equipmentID) {
            for (Equipment equip : equipmentSet)
                if (equip.getEqId() == equipmentID) {
                    return equip;
                }
            return null;
        }

    @Override
    public Equipment update(Equipment equipment) {
        Equipment edit = read(equipment.getEqId());
        if(edit != null) {
            equipmentSet.remove(edit);
            equipmentSet.add(equipment);
            return equipment;
        }
        return null;
    }


        @Override
        public boolean delete(Integer equipmentID)
        {
            Equipment delete = read(equipmentID);
            if(delete == null)
                return false;
            equipmentSet.remove(delete);
            return true;
        }

        @Override
        public Set<Equipment> getAll() {
            return equipmentSet;
        }
}
