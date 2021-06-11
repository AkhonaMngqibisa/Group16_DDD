package za.ac.cput.Factory;
/* TrainerFactoryTest.java
Test TrainerFactory.
Author: Bokang Molaoa (218131097) ADP3 Assignment 3.
Date: 09 June 2021

*/
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Trainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrainerFactoryTest {
    @Test
    public void createTrainerTest() {
        Trainer trainer = TrainerFactory.createTrainer("Bokang", "Molaoa", "0781155816",
                "30 John Street", "bokang@gmail.com", "Kga");
        System.out.println(trainer);
        assertNotNull(trainer);
    }

    @Test
    void testEquality() {
        Trainer trainer1 = new Trainer.Builder().setPhoneNo("0781155816").build();
        Trainer trainer2 = trainer1;
        assertEquals(trainer2,trainer1);
    }

    @Test
    void testIdentity() {
        Trainer trainer1 = new Trainer.Builder().setPhoneNo("0781155816").build();
        Trainer trainer2 = trainer1;
        assertSame(trainer2,trainer1);
    }

    @Test
    @Disabled
    void createTrainerDisable() {
        Trainer trainer = TrainerFactory.createTrainer("Bokang", "Molaoa", "0781155816",
                "30 John Street", "bokang@gmail.com", "Kga");
        System.out.println(trainer);
        assertNotNull(trainer);
    }

    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Testing Timed Out");
    }
}