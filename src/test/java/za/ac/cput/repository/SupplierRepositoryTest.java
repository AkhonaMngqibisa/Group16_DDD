//package za.ac.cput.repository;
//
///* SupplierRepositoryTest.java
//Test for the SupplierRepository
//Author: Lilitha Moni (219068429)
//Date: 22 July 2021
//*/
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.Supplier;
//import za.ac.cput.factory.SupplierFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class SupplierRepositoryTest {
//    private static SupplierRepository suppRepository = SupplierRepository.getSuppRepository();
//    private static Supplier supp = SupplierFactory.createSupplier("Lilitha", 1);
//
//    @Test
//    void create()
//    {
//        Supplier created = suppRepository.create(supp);
//        assertEquals(created.getSupId(), supp.getSupId());
//        System.out.println("Created Repository: "+created);
//    }
//
//    @Test
//    void read()
//    {
//        Supplier read = suppRepository.read(supp.getSupId());
//        assertNotNull(read);
//        System.out.println("Retrieved Repository: "+read);
//    }
//
//    @Test
//    void update()
//    {
//        Supplier update = new Supplier.Builder().copy(supp).setSupName("Zandile").build();
//        assertNotNull(suppRepository.update(update));
//        System.out.println("Updated Repository: "+update);
//    }
//
//    @Test
//    void delete()
//    {
//        boolean delete = suppRepository.delete(supp.getSupId())  ;
//        assertTrue(delete);
//        System.out.println("Deleted Repository: "+delete);
//    }
//
//
//    @Test
//    void getAll()
//    {
//        System.out.println(" Display the equipment");
//        assertEquals(1,suppRepository.getAll().size());
//        System.out.println(suppRepository.getAll());
//
//    }
//}