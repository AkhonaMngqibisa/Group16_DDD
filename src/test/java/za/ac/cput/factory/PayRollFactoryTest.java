package za.ac.cput.factory;
/* PayRollFactoryTest.java
Test PayRollFactory.
Author: Bokang Molaoa (218131097).
Date: 09 June 2021
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.PayRoll;
import static org.junit.jupiter.api.Assertions.*;

public class PayRollFactoryTest {
    @Test
    public void createPayRoll() {
        PayRoll payroll = PayRollFactory.createPayRoll(8000, "500", "8");
        System.out.println(payroll);
        assertNotNull(payroll);
    }

    @Test
    void testEquality() {
        PayRoll payroll = PayRollFactory.createPayRoll(8000, "54222", "5");
        assertEquals("525555",payroll.getPayrollID());
    }

    @Test
    void testIdentity() {
        PayRoll payroll = PayRollFactory.createPayRoll(8000, "54222", "5");
        assertSame("54222", payroll.getTrainerID());
    }

    @Test
    @Disabled
    void createPayRollDisabled() {
        PayRoll payroll = PayRollFactory.createPayRoll(8000, "54222", "5");
        System.out.println(payroll);
        assertNotNull(payroll);
    }
    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Testing Timed Out");
    }
}
