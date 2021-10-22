//Hlumelo Mpotulo
//215226348

package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.factory.WorkOutFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class WorkOutServiceImplTest {

    @Autowired
    public WorkOutServiceImpl workOutServiceImpl;
    public static WorkOut workOut = WorkOutFactory.createWorkOut(
            475647, "Runner Up", "xxxxxxxx"

    );

    @Test
    void a_create() {
        WorkOut created = workOutServiceImpl.create(workOut);
        assertEquals(created.getWorkoutId(), workOut.getWorkoutId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        WorkOut read = workOutServiceImpl.read(workOut.getWorkoutId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        WorkOut updated = new WorkOut.Builder().setWorkoutId(5665).setWorkoutName("RunnerUp").setWorkoutDescription("yyyyy").build();
        updated = workOutServiceImpl.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_getAll() {
        System.out.println("Display all\n-------\n" + workOutServiceImpl.getAll());
    }

    @Test
    void e_delete() {
        boolean deleted = workOutServiceImpl.delete(workOut.getWorkoutId());
        assertTrue(deleted);
        System.out.println("Delete: "
                + deleted);
    }
}

