package za.ac.cput.service.impl;

/* Admin.java
PaymentServiceTest for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PaymentServicemplTest {

    private static PaymentServicempl payservice;
    private static Payment payment = PaymentFactory.creatPayment(60000, "31 december 2021");


    @Test
    void a_create() {

        Payment created = payservice.create(payment);
        assertEquals(payment.getPaymentID(), created.getPaymentID());
        System.out.println("\nCreated: " + created);

    }

    @Test
    @Disabled
    void b_read() {

        Payment read = payservice.read(payment.getPaymentID());
        System.out.println("\nRead:\n" + read);
    }

    @Test
    @Disabled
    void c_update() {

        Payment payment1 = new Payment.Builder().copy(payment).setPaymentAmount(80000).build();
        payment1 = payservice.update(payment1);
        System.out.println("\nUpdated: " + payment1);
    }

    @Test
    @Disabled
    void d_delete() {

        boolean deleteSuccessful = payservice.delete(payment.getPaymentID());
        assertTrue(deleteSuccessful);

    }

    @Test
    @Disabled
    void getAll() { System.out.println("Display All: " + payservice.getAll()); }
}