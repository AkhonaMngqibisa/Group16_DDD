package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Equipment;
import za.ac.cput.repository.impl.IEquipmentRepository;

import java.util.Set;
import java.util.stream.Collectors;

/*
EquipmentServiceImpl.java
Equipment service Implementation
Author: Lilitha Moni (219068429)
Date: 28 July 2021
*/

@Service
public class EquipmentServiceImpl implements EquipmentService {
    private static EquipmentService equipmentService= null;

    @Autowired
    private IEquipmentRepository equipmentRepository;

    @Override
    public Equipment create(Equipment equipment) {

        return this.equipmentRepository.save(equipment);
    }

    @Override
    public Equipment read(Integer eqId) {
        return this.equipmentRepository.findById(eqId).orElse(null);
    }

    @Override
    public Equipment update(Equipment equipment) {
        if(this.equipmentRepository.existsById(equipment.getEqId()))
            return this.equipmentRepository.save(equipment);
        return null;
    }

    @Override
    public boolean delete(Integer eqId) {
        this.equipmentRepository.deleteById(eqId);
        if(this.equipmentRepository.existsById(eqId))
            return false;
        else

            return true;
    }

    @Override
    public Set<Equipment> getAll()
    {
        return this.equipmentRepository.findAll().stream().collect(Collectors.toSet());
    }
}
