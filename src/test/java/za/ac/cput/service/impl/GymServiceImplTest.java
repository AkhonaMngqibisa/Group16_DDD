package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Gym;
import za.ac.cput.entity.Package;
import za.ac.cput.factory.GymFactory;
import za.ac.cput.factory.PackageFactory;
import za.ac.cput.repository.impl.GymRepository;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class GymServiceImplTest {
    private static GymServiceImpl gymSe = (GymServiceImpl) GymServiceImpl.getGymservice();
    private static Gym gym = GymFactory.createGym("W'outZone","125 Steve Biko Road, Gugulethu");

    @Test
    void a_create() {
        Gym created = gymSe.create(gym);
        assertEquals(gym.getGymID(), created.getGymID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    void b_read() {
        Gym read = gymSe.read(gym.getGymID());
        assertNotNull(read);
        System.out.println("\nRead:\n" + read.toString());
    }

    @Test
    void c_update() {
        Gym gym1 = new Gym.Builder().copy(gym).setGymName("Work-out Zone").build();
        gym1 = gymSe.update(gym1);
        System.out.println("\nUpdated: " + gym1);
    }

    @Test
    void e_delete() {
        boolean deleteSuccessful = gymSe.delete(gym.getGymID());
        System.out.println("\nDeleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    void d_getAll() {
        System.out.println("\nDisplay All: " + gymSe.getAll());
    }

}