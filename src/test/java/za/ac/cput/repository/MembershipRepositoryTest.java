///* MembershipRepositoryTest.java
// * Class Repository Test for Membership
// * Author: Haroun Mohamed-Fakier [219095523]
// * Date: 24 July 2021
// */
//
//package za.ac.cput.repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.Member;
//import za.ac.cput.entity.Membership;
//import za.ac.cput.factory.MembershipFactory;
//import za.ac.cput.repository.impl.MembershipRepository;
//import za.ac.cput.util.GenericHelper;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class MembershipRepositoryTest {
//    public static MembershipRepository repository = MembershipRepository.getRepository();
//    public static Membership membership = MembershipFactory.createMembership(
//            new Member.Builder().setFirstName("Ariana").setLastName("Grande").build(),
//            "Gold",
//            300.00
//    );
//
//    @Test
//    void a_create() {
//        Membership created = repository.create(membership);
//        assertEquals(created.getID(), membership.getID());
//        System.out.println("Create\n---\n" + created + "---");
//    }
//
//    @Test
//    void b_read() {
//        Membership read = repository.read(membership.getID());
//        assertNotNull(read);
//        System.out.println("\nRead\n---\n" + read + "---");
//    }
//
//    @Test
//    void c_update() {
//        Membership updated = new Membership.Builder(membership).setType("Silver").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("\nUpdated\n---\n" + updated + "---");
//    }
//
//    @Test
//    void d_getAll() {
//        System.out.println("\nShow all\n---\n");
//        System.out.println(repository.getAll());
//        System.out.println("---");
//    }
//
//    @Test
//    void e_delete() {
//        boolean success = repository.delete(membership.getID());
//        assertTrue(success);
//        System.out.println("\nDelete: " + success);
//    }
//}