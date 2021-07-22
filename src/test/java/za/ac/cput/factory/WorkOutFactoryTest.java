package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.WorkOut;

import static org.junit.jupiter.api.Assertions.*;

class WorkOutFactoryTest {

    WorkOut jumps, butJump;
    @BeforeEach void setup(){
        jumps = WorkOutFactory.createWorkOut(21, "Jumps", "Jump over Ball");
        butJump = jumps;
    }

    @Test void testIdentity(){
        // Test two identical classes
        assertSame(jumps, butJump);
        System.out.println("Jumps and butJump are identical");
    }

    @Test void testEquality(){
        // Test two Equal classes
        assertEquals(jumps.getWorkoutId(), butJump.getWorkoutId());
        System.out.println("Jumps and butJump are Equal");
    }

    @Disabled("Disabled this test")
    @Test void testDisable(){
        // Test disable
        assertEquals(jumps.getWorkoutId(), butJump.getWorkoutId());
        System.out.println("Disabled!!");
    }

    @Timeout(1000)
    @Test void testTimeout() throws InterruptedException {
        // Test Timeout
        Thread.sleep(1000);
        System.out.println("Will pass after 10 seconds!");
    }

}