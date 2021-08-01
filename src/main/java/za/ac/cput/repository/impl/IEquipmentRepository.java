package za.ac.cput.repository.impl;

/* IEquipmentRepository.java
Interface Repository for the Equipment
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import za.ac.cput.entity.Equipment;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IEquipmentRepository extends IRepository<Equipment, Integer> {
    public Set<Equipment> getAll();
}
