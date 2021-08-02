/* TrainerServiceImplTest.java
 * Class Service Test for Trainer.
 * Author: Bokang Molaoa [218131097]
 * Date: 02 August 2021.
 */
package za.ac.cput.service.impl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Trainer;
import za.ac.cput.factory.TrainerFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class TrainerServiceImplTest {
    private static TrainerServiceImpl trainerService = (TrainerServiceImpl)  TrainerServiceImpl.getInstance();
    private static Trainer trainer = TrainerFactory.createTrainer("Thabang","Molaoa","0635584671","60 Grand Town","tm@gmail.com","10255hhg");

    @Test
    void a_create() {
        Trainer created = trainerService.create(trainer);
        assertEquals(trainer.getTrainerID(), created.getTrainerID());
        System.out.println("\nCreated: " + created);
    }
    @Test
    void b_read() {
        Trainer read = trainerService.read(trainer.getTrainerID());
        assertNotNull(read);
        System.out.println("\nRead:\n" + read.toString());
    }

    @Test
    void c_update() {
        Trainer trainer1 = new Trainer.Builder().copy(trainer).setPassword("GT0011").build();
        trainer1 = trainerService.update(trainer1);
        System.out.println("\nUpdated: " + trainer1);
    }

    @Test
    void e_delete() {
        boolean deleteSuccessful = trainerService.delete(trainer.getTrainerID());
        System.out.println("\nDeleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    void d_getAll() {
        System.out.println("\nDisplay All: " + trainerService.getAll());
    }

}


