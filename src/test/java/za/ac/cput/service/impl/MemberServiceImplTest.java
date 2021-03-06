package za.ac.cput.service.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Member;
import za.ac.cput.factory.MemberFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class MemberServiceImplTest {

    @Autowired
    private static MemberServiceImpl membSe;

    private static Member member = MemberFactory.createMember("Daniel", "Peter","4 Black Manenberg","0788123456",25,"Activity","danielp@gmail.com","12345");

    @Test
    void a_create() {
        Member created = membSe.create(member);
        assertEquals(member.getMemberID(), created.getMemberID());
        System.out.println("\nCreated: " + created);
    }

    @Test
    @Disabled
    void b_read() {
        Member read = membSe.read(member.getMemberID());
        assertNotNull(read);
        System.out.println("\nRead:\n" + read.toString());
    }

    @Test
    @Disabled

    void c_update() {
        Member member1 = new Member.Builder().copy(member).setLastName("Jash").build();
        member1 = membSe.update(member1);
        System.out.println("\nUpdated: " + member1);
    }

    @Test
    @Disabled
    void e_delete() {
        boolean deleteSuccessful = membSe.delete(member.getMemberID());
        System.out.println("\nDeleted: ");
        assertTrue(deleteSuccessful);
    }

    @Test
    @Disabled
    void d_getAll() {
        System.out.println("\nDisplay All: " + membSe.getAll());
    }


}