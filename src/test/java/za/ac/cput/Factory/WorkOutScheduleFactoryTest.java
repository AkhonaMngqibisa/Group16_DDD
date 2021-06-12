package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.WorkOutSchedule;

import static org.junit.jupiter.api.Assertions.*;

class WorkOutScheduleFactoryTest {

    WorkOutSchedule afternoon, morning;
    @BeforeEach
    void setup(){
       afternoon = WorkOutScheduleFactory.createWorkOutSchedule(21, 12, 34, 12,
               "12/05/21", "19:00");
       morning = afternoon;
    }

    @Test
    void testIdentity(){
        // Test two identical classes
        assertSame(morning, afternoon);
        System.out.println("Morning and Afternoon are identical");
    }

    @Test void testEquality(){
        // Test two Equal classes
        assertEquals(morning.getTrainerId(), afternoon.getTrainerId());
        System.out.println("Morning Trainer and Afternoon Trainer are Equal");
    }

    @Disabled("Disabled this test")
    @Test void testDisable(){
        // Test disable
        assertEquals(morning.getWorkoutId(), afternoon.getWorkoutId());
        System.out.println("Disabled!!");
    }

    @Timeout(1000)
    @Test void testTimeout() throws InterruptedException {
        // Test Timeout
        Thread.sleep(1000);
        System.out.println("Will pass after 10 seconds!");
    }

}