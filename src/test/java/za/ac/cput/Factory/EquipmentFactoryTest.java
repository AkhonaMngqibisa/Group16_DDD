package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Equipment;

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
    }
}

