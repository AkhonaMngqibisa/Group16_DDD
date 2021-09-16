package za.ac.cput.repository.impl;

/* IEquipmentRepository.java
Interface Repository for the Equipment
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Equipment;


@Repository
public interface IEquipmentRepository extends JpaRepository<Equipment, Integer>
{


}
