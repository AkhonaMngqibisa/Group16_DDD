package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Member;
import za.ac.cput.factory.MemberFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class MemberRepositoryTest {
    private static MemberRepository membRep = MemberRepository.getMembRep();
    private static Member member = MemberFactory.createMember("Daniel", "Peter","4 Black Manenberg","0788123456",25,"Activity","danielp@gmail.com","12345");


    @Test
    void a_create() {
        Member created = membRep.create(member);
        assertEquals(created.getMemberID(), member.getMemberID());
        System.out.println("Inserted: "+created);
    }

    @Test
    void b_read() {
        Member read = membRep.read(member.getMemberID());
        assertNotNull(read);
        System.out.println("Retrieve: "+read);
    }

    @Test
    void c_update() {
        Member updated = new Member.Builder().copy(member).setLastName("Jantjies").build();
        assertNotNull(membRep.update(updated));
        System.out.println("Update: "+updated);
    }

    @Test
    void e_delete() {
        boolean success = membRep.delete(member.getMemberID())  ;
        assertTrue(success);
        System.out.println("Delete: "+success);
    }

    @Test
    void d_getAll() {

        System.out.println(" Print Members");
        assertEquals(1,membRep.getAll().size());
        System.out.println(membRep.getAll());
    }
}