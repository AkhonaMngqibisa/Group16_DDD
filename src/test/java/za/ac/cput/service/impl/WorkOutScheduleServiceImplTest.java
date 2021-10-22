//Hlumelo Mpotulo
//215226348

package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.factory.WorkOutScheduleFactory;
import za.ac.cput.service.IService;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class WorkOutScheduleServiceImplTest {

    @Autowired
    public static WorkOutScheduleServiceImpl workOutScheduleServiceImpl;
    public static WorkOutSchedule workOutSchedule = WorkOutScheduleFactory.createWorkOutSchedule(
            475647,8676, 69423, 1091, "24 October 2021", "09H30"
    );
    @Test
    void a_createWorkOutScheduleTest()
    {

        WorkOutSchedule newWorkOutScheduleRepo = workOutScheduleServiceImpl.create(workOutSchedule);


        assertEquals(newWorkOutScheduleRepo.getWorkoutId(), workOutSchedule.getWorkoutId());


        System.out.println("New Work Out Schedule Created:" + newWorkOutScheduleRepo);
    }

//    @Test
//    void b_readWorkOutScheduleTest()
//    {
//
//        WorkOutSchedule repoRead = WorkOutScheduleService.read(workOutSchedule.getWorkoutId());
//
//
//        assertNotNull(repoRead);
//
//
//        System.out.println("WorkOutSchedule Read:" + repoRead);
//    }
@Test
@Disabled
void b_read() {
    WorkOutSchedule read = workOutScheduleServiceImpl.read(workOutSchedule.getWorkoutId());
    assertNotNull(read);
    System.out.println("\nRead:\n" + read.toString());
}


    @Test
    void c_update() {
        WorkOutSchedule updated = new WorkOutSchedule.Builder().setWorkoutId(5665)
                .setScheduleId(565)
                .setMemberId(656)
                .setTrainerId(6767)
                .setWorkoutDate("31 October 2")
                .setWorkoutTime("16H00")
                .build();


        updated = workOutScheduleServiceImpl.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_getAll() {
        System.out.println("\nDisplay all\n---\n");
        System.out.println(workOutScheduleServiceImpl.getAll());
        System.out.println("------");
    }

    @Test
    void d_deleteExistingWorkOutScheduleTest()
    {

        boolean success = workOutScheduleServiceImpl.delete(workOutSchedule.getWorkoutId());


        assertTrue(success);


        System.out.println("WorkOutSchedule  Deleted" + success);
    }
}
