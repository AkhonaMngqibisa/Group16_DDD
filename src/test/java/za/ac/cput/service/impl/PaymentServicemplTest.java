package za.ac.cput.service.impl;

/* Admin.java
PaymentServiceTest for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PaymentServicemplTest {

    private static PaymentServicempl paymentServicempl = (PaymentServicempl) PaymentServicempl.getPayservice();
    private static Payment payment = PaymentFactory.creatPayment(60000, "31 december 2021");

    @Test
    void getPayservice() {
    }

    @Test
    void create() {

        Payment created = paymentServicempl.create(payment);
        assertEquals(payment.getPaymentID(), created.getPaymentID());
        System.out.println("\nCreated: " + created);

    }

    @Test
    void read() {

        Payment read = paymentServicempl.read(payment.getPaymentID());
        System.out.println("\nRead:\n" + read);
    }

    @Test
    void update() {

        Payment payment1 = new Payment.Builder().copy(payment).setPaymentAmount(80000).build();
        payment1 = paymentServicempl.update(payment1);
        System.out.println("\nUpdated: " + payment1);
    }

    @Test
    void delete() {

        boolean deleteSuccessful = paymentServicempl.delete(payment.getPaymentID());
        assertTrue(deleteSuccessful);

    }

    @Test
    void getAll() { System.out.println("Display All: " + paymentServicempl.getAll()); }
}