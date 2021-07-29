/* TrainerRepositoryTest.java
 * Class Repository Test for Trainer.
 * Author: Bokang Molaoa [218131097]
 * Date: 24 July 2021
 */
package za.ac.cput.repository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Trainer;
import za.ac.cput.factory.TrainerFactory;
import za.ac.cput.repository.impl.TrainerRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TrainerRepositoryTest {
    public static TrainerRepository repository = TrainerRepository.getRepository();
    public static Trainer trainer = TrainerFactory.createTrainer("Mark","Mayambela","0785588888","3077 Magq Street","markprof@gmail.com","##4567645");

    @Test
    void a_create() {
        Trainer created = repository.create(trainer);
        assertEquals(created.getTrainerID(), trainer.getTrainerID());
        System.out.println("Create\n.....\n" + created + "______");
    }

    @Test
    void b_read() {
        Trainer read = repository.read(trainer.getTrainerID());
        assertNotNull(read);
        System.out.println("\nRead\n......\n" + read + "_______");
    }

    @Test
    void c_update() {
        Trainer updated = new Trainer.Builder().copy(trainer).setAddress("30 Mark Street").build();
        assertNotNull(trainer.getAddress());
        System.out.println("Update: "+updated);
    }

    @Test
    void d_getAll() {
        System.out.println("\nShow all\n.....\n");
        System.out.println(repository.getAll());
        System.out.println("_______");
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(trainer.getTrainerID());
        assertTrue(success);
        System.out.println("\nDelete: " + success);
    }
}
