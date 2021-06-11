package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Payment;
import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    public void createPayment(){

        Payment payment=PaymentFactory.creatPayment(20,10,2.5,"2021/06/11");
        System.out.println(payment.getPaymentID());
        assertNotNull(payment.getPaymentID());
        System.out.println(payment);

    }
}