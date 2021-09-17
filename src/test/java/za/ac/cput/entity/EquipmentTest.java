package za.ac.cput.entity;

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

        }
    }

