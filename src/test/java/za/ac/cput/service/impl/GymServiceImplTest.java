package za.ac.cput.service.impl;
/* GymServiceImplTest.java
Service Test for the Gym
Author: Akhona Mngqibisa (217302394)
Date: 02 August 2021
*/
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Gym;
import za.ac.cput.factory.GymFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class GymServiceImplTest {
    @Autowired
    private static GymServiceImpl gymSe;

    private static Gym gym = GymFactory.createGym("W'outZone","125 Steve Biko Road, Gugulethu");

    @Test
    void a_create() {
        Gym created = gymSe.create(gym);
        assertEquals(gym.getGymID(), created.getGymID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    @Disabled
    void b_read() {
        Gym read = gymSe.read(gym.getGymID());
        assertNotNull(read);
        System.out.println("\nRead:\n" + read.toString());
    }

    @Test
    @Disabled
    void c_update() {
        Gym gym1 = new Gym.Builder().copy(gym).setGymName("Work-out Zone").build();
        gym1 = gymSe.update(gym1);
        System.out.println("\nUpdated: " + gym1);
    }

    @Test
    @Disabled
    void e_delete() {
        boolean deleteSuccessful = gymSe.delete(gym.getGymID());
        System.out.println("\nDeleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    @Disabled
    void d_getAll() {
        System.out.println("\nDisplay All: " + gymSe.getAll());
    }

}