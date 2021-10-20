//Hlumelo Mpotulo
//215226348

package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.factory.WorkOutFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class WorkOutServiceImplTest {

    public static WorkOutServiceImpl workOutServiceImpl = (WorkOutServiceImpl) WorkOutServiceImpl.getInstance();
    public static WorkOut workOut = WorkOutFactory.createWorkOut(
            475647, "Runner Up", "xxxxxxxx"

    );

    @Test
    void a_create() {
        WorkOut created = WorkOutServiceImpl.create(workOut);
        assertEquals(created.getWorkoutId(), workOut.getWorkoutId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        WorkOut read = WorkOutServiceImpl.read(workOut.getWorkoutId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        WorkOut updated = new WorkOut.Builder().setWorkoutId(5665).setWorkoutName("RunnerUp").setWorkoutDescription("yyyyy").build();
        updated = WorkOutServiceImpl.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_getAll() {
        System.out.println("Display all\n-------\n" + WorkOutServiceImpl.getAll());
    }

    @Test
    void e_delete() {
        boolean deleted = WorkOutServiceImpl.delete(workOut.getWorkoutId());
        assertTrue(deleted);
        System.out.println("Delete: "
                + deleted);
    }
}

