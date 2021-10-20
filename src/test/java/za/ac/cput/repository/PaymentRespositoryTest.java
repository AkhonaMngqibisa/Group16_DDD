package za.ac.cput.repository;

/*
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.repository.impl.PaymentRespository;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class PaymentRespositoryTest {

    private static PaymentRespository paymentRespository = PaymentRespository.getPaymentRep();
    private static Payment pays = PaymentFactory.creatPayment(30000,
            "31 August 2021");

    @Test
    void create() {

        Payment created = paymentRespository.create(pays);
        assertEquals(created.getPaymentID(), pays.getPaymentID());
        System.out.println("Create\n---\n" + created + "---");
    }

    @Test
    void read() {

        Payment read = paymentRespository.read(pays.getPaymentID());
        assertNotNull(read);
        System.out.println("\nRead\n---\n" + read + "---");
    }

    @Test
    void update() {

        Payment updated = new Payment.Builder().copy(pays).setPaymentAmount(50000).build();
        assertNotNull(pays.getPaymentAmount());
        System.out.println("Update: "+updated);
    }

    @Test
    void delete() {

        boolean delete = paymentRespository.delete(pays.getPaymentID());
        assertTrue(delete);
        System.out.println("Deleted Repository: "+delete);
    }

    @Test
    void getAll() {

        System.out.println(" Display the equipment");
        assertEquals(1,paymentRespository.getAll().size());
        System.out.println(paymentRespository.getAll());
    }
}
*/
