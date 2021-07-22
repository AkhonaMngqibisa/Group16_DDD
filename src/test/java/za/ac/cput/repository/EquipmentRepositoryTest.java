package za.ac.cput.repository;

/* EquipmentRepositoryTest.java
Test for the EquipmentRepository
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Equipment;
import za.ac.cput.factory.EquipmentFactory;

public class EquipmentRepositoryTest {
    @Test
    public void createEquipment(){
        Equipment equipment = EquipmentFactory.createEquipment("Yoga Mat",
                "Synthetic nontoxic", "TPE");
        System.out.println(equipment);
    }
}
