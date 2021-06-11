package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* Equipment.java
Test for the Equipment
Author: Lilitha Moni (219068429)
Date: 10 June 2021
*/

public class EquipmentTest {
        @Test
        public void AddEquipmentTest()
        {
            Equipment equipment = new Equipment.Builder()
                    .setEqName("Treadmill")
                    .setEqModel("Trojan TR500")
                    .setEqInfo("Electrical")
                    .build();

            System.out.println(equipment);

            assertEquals(50, equipment.AddEquipment().size());
        }

        @Test
        public void EditEquipmentTest()
        {
            Equipment equipment = new Equipment.Builder().build();
            assertEquals(50, equipment.EditEquipment().size());
        }

        @Test
        public void DeleteEquipmentTest()
        {
            Equipment equipment = new Equipment.Builder().build();
            assertEquals(48, equipment.DeleteEquipment().size());

        }

    }

