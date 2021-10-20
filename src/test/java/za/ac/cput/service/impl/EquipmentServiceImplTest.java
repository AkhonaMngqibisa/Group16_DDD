package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.entity.Equipment;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.factory.EquipmentFactory;

/*SupplierImplTest.java
Service Impl test class for Equipment
Name: Lilitha Moni
Date: 28 July 2021
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest

class EquipmentServiceImplTest {

    private static EquipmentServiceImpl equipmentService;
    private static Equipment equipment = EquipmentFactory.createEquipment("Kettlebel", "6kg", "cast steel weight");

    @Test
    void a_create() {
        Equipment created = equipmentService.create(equipment);
        assertEquals(equipment.getEqId(), created.getEqId());
        System.out.println("Created: " + created);
    }

    @Test
    @Disabled
    void b_read() {
        Equipment read = equipmentService.read(equipment.getEqId());
        assertNotNull(read);
        System.out.println("Read:" + read.toString());
    }

    @Test
    @Disabled
    void c_update() {
        Equipment firstEquipmet = new Equipment.Builder().copy(equipment).setEqName("Trainer Pro Kit").build();
        firstEquipmet = equipmentService.update(firstEquipmet);
        System.out.println("Updated: " + firstEquipmet);
    }

    @Test
    @Disabled
    void e_delete() {
        boolean deleteSuccessful = equipmentService.delete(equipment.getEqId());
        System.out.println("Deleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    @Disabled
    void d_getAll() {
        System.out.println("Display All: " + equipmentService.getAll());
    }
}
