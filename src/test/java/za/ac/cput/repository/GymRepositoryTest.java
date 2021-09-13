//
//package za.ac.cput.repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.Gym;
//import za.ac.cput.factory.GymFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class GymRepositoryTest {
//private static GymRepository gymRep = GymRepository.getGymRep();
//private static Gym gym = GymFactory.createGym("W'outZone","125 Steve Biko Road, Gugulethu");
//
//@Test
//void a_create()
//{
//    Gym created = gymRep.create(gym);
//    assertEquals(created.getGymID(), gym.getGymID());
//    System.out.println("Inserted: "+created);
//}
//
//@Test
//void b_read()
//{
//    Gym read = gymRep.read(gym.getGymID());
//    assertNotNull(read);
//    System.out.println("Retrieve: "+read);
//}
//
//@Test
//void c_update()
//{
//    Gym updated = new Gym.Builder().copy(gym).setGymAddress("No125 Ny1, Gugulethu ").build();
//    assertNotNull(gymRep.update(updated));
//    System.out.println("Update: "+updated);
//}
//
//@Test
//void e_delete()
//{
//    boolean success = gymRep.delete(gym.getGymID())  ;
//    assertTrue(success);
//    System.out.println("Delete: "+success);
//}
//
//@Test
//void d_getAll()
//{
//    System.out.println(" Print Gym");
//    assertEquals(1,gymRep.getAll().size());
//    System.out.println(gymRep.getAll());
//
//}
//}
