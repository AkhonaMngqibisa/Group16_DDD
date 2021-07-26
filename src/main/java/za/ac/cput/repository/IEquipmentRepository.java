package za.ac.cput.repository;

/* IEquipmentRepository.java
Interface Repository for the Equipment
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import za.ac.cput.entity.Equipment;
import java.util.List;

public interface IEquipmentRepository extends IRepository<Equipment, Integer> {
    public List<Equipment> getAll();
}
