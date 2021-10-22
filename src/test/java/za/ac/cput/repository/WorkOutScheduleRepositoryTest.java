////Hlumelo Mpotulo
////215226348
//
//
//package za.ac.cput.repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.WorkOutSchedule;
//import za.ac.cput.factory.WorkOutScheduleFactory;
//import za.ac.cput.repository.impl.WorkOutScheduleRepository;
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//
//public class WorkOutScheduleRepositoryTest {
//
//    private static WorkOutScheduleRepository repository = WorkOutScheduleRepository.getRepository();
//    private static WorkOutSchedule workOutSchedule = WorkOutScheduleFactory.createWorkOutSchedule(65876,557,5577,5656, "24 October 2021", "10H00");
//
//
//    @Test
//    void a_createWorkOutScheduleTest()
//    {
//
//        WorkOutSchedule newWorkOutScheduleRepo = repository.create(workOutSchedule);
//
//
//        assertEquals(newWorkOutScheduleRepo.getWorkoutId(), workOutSchedule.getWorkoutId());
//
//
//        System.out.println("New Work Out Schedule Created:" + newWorkOutScheduleRepo);
//    }
//
//    @Test
//    void b_readWorkOutScheduleTest()
//    {
//
//        WorkOutSchedule repoRead = repository.read(workOutSchedule.getWorkoutId());
//
//
//        assertNotNull(repoRead);
//
//
//        System.out.println("WorkOutSchedule Read:" + repoRead);
//    }
//
//    @Test
//    void c_updateExistingWorkOutScheduleTest()
//    {
//        WorkOutSchedule updated = new WorkOutSchedule.Builder().setWorkoutId(5656).setScheduleId(4546).setMemberId(7879).setTrainerId(234).setWorkoutDate("15 November 2021").setWorkoutTime("13H00").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("\nUpdated\n---\n" + updated + "---");
//    }
//
//    @Test
//    void d_deleteExistingWorkOutScheduleTest()
//    {
//
//        boolean success = repository.delete(workOutSchedule.getWorkoutId());
//
//
//        assertTrue(success);
//
//
//        System.out.println("WorkOutSchedule  Deleted" + success);
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("\nDisplay all\n---\n");
//        System.out.println(repository.getAll());
//        System.out.println("------");
//    }
//
//
//}
