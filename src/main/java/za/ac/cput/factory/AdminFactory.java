package za.ac.cput.factory;

/* Payment.java
Factory for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import za.ac.cput.entity.Admin;
import za.ac.cput.util.GenericHelper;

public class AdminFactory {

    public static Admin creatAdmin( String fisrtName, String lastName, String phoneNo, String emailAddress) {

        int ID= GenericHelper.generateId();
        Admin admin= new Admin.Builder()
                .setFirstName(fisrtName)
                .setID(ID)
                .setLastName(lastName)
                .setPhoneNo(phoneNo)
                .setEmailAddress(emailAddress)
                .build();

        return admin;
    }


}
