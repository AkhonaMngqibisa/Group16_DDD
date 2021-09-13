//package za.ac.cput.entity;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
///* MemberTest.java
//Testing Member
//Author: Akhona Mngqibisa (217302394)
//Date: 09 June 2021
//*/
//class MemberTest
//{
//        @Test
//        public void AddMemberTest()
//        {
//            Member member = new Member.Builder()
//                    .setFirstName("Akhona")
//                    .setLastName("Mngqibisa")
//                    .setAddress("Ny1 No147 Gugulethu")
//                    .setPhoneNo("0621982193")
//                    .setAge(22)
//                    .setStatus("Active")
//                    .setEmailAddress("akhonam@gmail.com")
//                    .setPassword("12345")
//                    .build();
//
//            System.out.println(member);
//
//            assertEquals(1, member.AddMember().size());                //Test size of the List after Adding
//        }
//
//    @Test
//    public void DeleteMemberTest()
//    {
//        Member member = new Member.Builder().build();
//        assertEquals(0, member.DeleteMember().size());                  //Test size of the List after Deleting
//
//    }
//
//    }
//
