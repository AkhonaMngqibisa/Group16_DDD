package za.ac.cput.service.impl;

import za.ac.cput.entity.Equipment;
import za.ac.cput.repository.impl.EquipmentRepository;
import java.util.Set;

/*
EquipmentServiceImpl.java
Equipment service Implementation
Author: Lilitha Moni (219068429)
Date: 28 July 2021
*/


public class EquipmentServiceImpl implements EquipmentService {

    private static EquipmentService SEquipment;
    private EquipmentRepository equipmentRep;

    public EquipmentServiceImpl(EquipmentRepository equipmentRep) {
        this.equipmentRep = equipmentRep;
    }

    public EquipmentServiceImpl() {
        this.equipmentRep = EquipmentRepository.getEquipmentRep();

    }

    public static EquipmentService getEquipmentService() {

        if (SEquipment == null)
            SEquipment = new EquipmentServiceImpl();
        return SEquipment;
    }

    @Override
    public Equipment create(Equipment equipment) {

        return this.equipmentRep.create(equipment);
    }

    @Override
    public Equipment read(Integer equipmentID) {

        return this.equipmentRep.read(equipmentID);
    }

    @Override
    public Equipment update(Equipment equipment) {

        return this.equipmentRep.update(equipment);
    }

    @Override
    public boolean delete(Integer equipmentID) {

        return this.delete(equipmentID);
    }

    public Set<Equipment> getAll() {
        return this.equipmentRep.getAll();
    }
}
