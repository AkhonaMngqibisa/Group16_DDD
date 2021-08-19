/* PayRollServiceImplTest.java
 * Class Service Test for PayRoll.
 * Author: Bokang Molaoa [218131097]
 * Date: 02 August 2021.
 */
package za.ac.cput.service.impl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.PayRoll;
import za.ac.cput.factory.PayRollFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class PayRollServiceImplTest {
    private static PayRollServiceImpl payRollService = (PayRollServiceImpl)  PayRollServiceImpl.getInstance();
    private static PayRoll payRoll = PayRollFactory.createPayRoll(8000,"562621","2");

    @Test
    void a_create() {
        PayRoll created = payRollService.create(payRoll);
        assertEquals(payRoll.getPayrollID(), created.getPayrollID());
        System.out.println("\nCreated: " + created);
    }
    @Test
    void b_read() {
        PayRoll read = payRollService.read(payRoll.getPayrollID());
        assertNotNull(read);
        System.out.println("\nRead:\n" + read.toString());
    }

    @Test
    void c_update() {
        PayRoll payRoll1 = new PayRoll.Builder().copy(payRoll).setHours("4").build();
        payRoll1 = payRollService.update(payRoll1);
        System.out.println("\nUpdated: " + payRoll1);
    }

    @Test
    void e_delete() {
        boolean deleteSuccessful = payRollService.delete(payRoll.getPayrollID());
        System.out.println("\nDeleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    void d_getAll() {
        System.out.println("\nDisplay All: " + payRollService.getAll());
    }

}
