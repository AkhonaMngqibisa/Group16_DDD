package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Supplier;

/* SupplierFactoryTest.java
Test SupplierFactory
Author: Lilitha Moni  (219068429)
Date: 11 June 2021
*/

public class SupplierFactoryTest {
    @Test
    public void createSupplier(){
       Supplier supplier = SupplierFactory.createSupplier("Lilitha Moni", 542);
        System.out.println(supplier);
    }
}
