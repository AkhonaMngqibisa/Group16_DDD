package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Supplier;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.factory.SupplierFactory;

/*SupplierImplTest.java
Service Impl test class for Supplier
Name: Lilitha Moni
Date: 28 July 2021
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
class SupplierServiceImplTest {
    private static SupplierServiceImpl supplierService = (SupplierServiceImpl) SupplierServiceImpl.getSupplierService();
    private static Supplier supplier = SupplierFactory.createSupplier("Lilitha", 452);

    @Test
    void a_create() {
        Supplier created = supplierService.create(supplier);
        assertEquals(supplier.getEqId(), created.getSupId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Supplier read = supplierService.read(supplier.getSupId());
        assertNotNull(read);
        System.out.println("Read:" + read.toString());
    }

    @Test
    void c_update() {
        Supplier firstSupplier = new Supplier.Builder().copy(supplier).setSupName("Zethu").build();
        firstSupplier = supplierService.update(firstSupplier);
        System.out.println("Updated: " + firstSupplier);
    }

    @Test
    void e_delete() {
        boolean deleteSuccessful = supplierService.delete(supplier.getSupId());
        System.out.println("Deleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    void d_getAll() {
        System.out.println("Display All: " + supplierService.getAll());
    }
}


