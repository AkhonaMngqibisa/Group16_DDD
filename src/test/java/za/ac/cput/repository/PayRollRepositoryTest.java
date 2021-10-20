///* PayRollRepositoryTest.java
// * Class Repository Test for Payroll.
// * Author: Bokang Molaoa [218131097]
// * Date: 24 July 2021.
// */
//package za.ac.cput.repository;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.PayRoll;
//import za.ac.cput.factory.PayRollFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class PayRollRepositoryTest {
//    public static PayRollRepository repository = PayRollRepository.getRepository();
//    public static PayRoll payRoll = PayRollFactory.createPayRoll(8000,"145555","8");
//
//    @Test
//    void a_create() {
//        PayRoll created = repository.create(payRoll);
//        assertEquals(created.getPayrollID(), payRoll.getPayrollID());
//        System.out.println("Create\n.....\n" + created + "______");
//    }
//
//    @Test
//    void b_read() {
//        PayRoll read = repository.read(payRoll.getPayrollID());
//        assertNotNull(read);
//        System.out.println("\nRead\n......\n" + read + "_______");
//    }
//
//    @Test
//    void c_update() {
//        PayRoll updated = new PayRoll.Builder().copy(payRoll).setHours("6").build();
//        assertNotNull(payRoll.getHours());
//        System.out.println("Update: "+updated);
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("\nShow all\n.....\n");
//        System.out.println(repository.getAll());
//        System.out.println("_______");
//    }
//
//    @Test
//    void e_delete() {
//        boolean success = repository.delete(payRoll.getPayrollID());
//        assertTrue(success);
//        System.out.println("\nDelete: " + success);
//    }
//}
