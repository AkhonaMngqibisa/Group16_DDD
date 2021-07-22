package za.ac.cput.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* Supplier.java
Test for the Supplier
Author: Lilitha Moni (219068429)
Date: 10 June 2021
*/

public class SupplierTest {
    @Test
    public void AddSupplierTest() {
        Supplier supplier = new Supplier.Builder()
                .setSupName("Lilitha")
                .setEqId(452)
                .build();

        System.out.println(supplier);

        assertEquals(10, supplier.AddSupplier().size());
    }

    @Test
    public void EditSupplierTest()
    {
        Supplier supplier = new Supplier.Builder().build();
        assertEquals(10, supplier.EditSupplier().size());
    }

}