package za.ac.cput.Factory;

import za.ac.cput.Entity.Member;
import za.ac.cput.Util.GenericHelper;

/* MemberFactory.java
Factory for the Member
Author: Akhona Mngqibisa (217302394)
Date: 9 June 2021
*/
public class MemberFactory
{
    public static Member createMember(String firstName, String lastName, String address, String phoneNo, int age, String status, String emailAddress, String password)
    {
        int memberID= GenericHelper.generateId();
        Member member= new Member.Builder()
                .setMemberID(memberID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setPhoneNo(phoneNo)
                .setAge(age)
                .setStatus(status)
                .setEmailAddress(emailAddress)
                .setPassword(password)
                .build();

        return member;

    }

}

