//Hlumelo Mpotulo
//215226348

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.factory.WorkOutFactory;
import za.ac.cput.repository.impl.WorkOutRepository;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class WorkOutRepositoryTest {

    private static WorkOutRepository repository = WorkOutRepository.getWorkOutRepository();
    private static WorkOut workOut = WorkOutFactory.createWorkOut(65876,"Push Ups", "xxxxxxxx");


    @Test
    void a_createWorkOutTest()
    {

        WorkOut newWorkOutRepo = repository.create(workOut);


        assertEquals(newWorkOutRepo.getWorkoutId(), workOut.getWorkoutId());


        System.out.println("New Work Out Created:" + newWorkOutRepo);
    }

    @Test
    void b_readWorkOutTest()
    {

        WorkOut repoRead = repository.read(workOut.getWorkoutId());


        assertNotNull(repoRead);


        System.out.println("WorkOut Read:" + repoRead);

    }

    @Test
    void c_updateExistingWorkOutTest()
    {
        WorkOut updated = new WorkOut.Builder().setWorkoutId(5656).setWorkoutName("Limyoli").setWorkoutDescription("yyyyyy").build();
        assertNotNull(repository.update(updated));
        System.out.println("\nUpdated\n---\n" + updated + "---");
    }

    @Test
    void d_deleteExistingWorkOutTest()
    {

        boolean success = repository.delete(workOut.getWorkoutId());


        assertTrue(success);


        System.out.println("WorkOut Deleted" + success);
    }

    @Test
    void d_getAll() {
        System.out.println("\nDisplay all\n---\n");
        System.out.println(repository.getAll());
        System.out.println("------");
    }

}
