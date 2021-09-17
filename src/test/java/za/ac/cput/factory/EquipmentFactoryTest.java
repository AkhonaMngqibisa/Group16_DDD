package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Equipment;
import za.ac.cput.entity.Gym;

import static org.junit.jupiter.api.Assertions.assertTrue;

/* EquipmentFactoryTest.java
Test EquipmentFactory
Author: Lilitha Moni  (219068429)
Date: 11 June 2021
*/

public class EquipmentFactoryTest {
    @Test
    public void createEquipment(){
        Equipment equipment = EquipmentFactory.createEquipment("Treadmill",
                        "Trojan TR500", "Electrical");
        System.out.println(equipment);

        assertTrue(equipment instanceof Equipment);
    }
}

