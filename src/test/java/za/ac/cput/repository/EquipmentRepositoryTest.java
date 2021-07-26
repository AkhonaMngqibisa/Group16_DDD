package za.ac.cput.repository;

/* EquipmentRepositoryTest.java
Test for the EquipmentRepository
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Equipment;
import za.ac.cput.factory.EquipmentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EquipmentRepositoryTest {
    private static EquipmentRepository equipRepository = EquipmentRepository.getEquipmentRep();
    private static Equipment equip = EquipmentFactory.createEquipment("JX Fitness",
            "913 Home City", "Multi Gym");

    @Test
    void create()
    {
        Equipment created = equipRepository.create(equip);
        assertEquals(created.getEqId(), equip.getEqId());
        System.out.println("Created Repository: "+created);
    }

    @Test
    void read()
    {
        Equipment read = equipRepository.read(equip.getEqId());
        assertNotNull(read);
        System.out.println("Retrieved Repository: "+read);
    }

    @Test
    void update()
    {
        Equipment update = new Equipment.Builder().copy(equip).setEqModel("Squat Rack").build();
        assertNotNull(equipRepository.update(update));
        System.out.println("Updated Repository: "+update);
    }

    @Test
    void delete()
    {
        boolean delete = equipRepository.delete(equip.getEqId())  ;
        assertTrue(delete);
        System.out.println("Deleted Repository: "+delete);
    }


    @Test
    void getAll()
    {
        System.out.println(" Display the equipment");
        assertEquals(1,equipRepository.getAll().size());
        System.out.println(equipRepository.getAll());

    }
}
