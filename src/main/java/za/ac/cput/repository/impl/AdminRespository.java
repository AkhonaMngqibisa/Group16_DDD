package za.ac.cput.repository.impl;

/* Admin.java
Entity for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import za.ac.cput.entity.Admin;
import java.util.HashSet;
import java.util.Set;
/*
public class AdminRespository implements IAdminRespository {

    private static AdminRespository adminRep = null;
    private Set<Admin> adminSet;

    public AdminRespository() {
        this.adminSet = new HashSet<>();
    }

    public static AdminRespository getAdminRep(){

        if(adminRep == null)
        {
            adminRep = new AdminRespository();
        }
        return adminRep;
    }

    @Override
    public Admin create(Admin admin) {


        boolean added = adminSet.add(admin);
        if(!added)
            return null;

        return admin;
    }

    @Override
    public Admin read(Integer ID) {

        for(Admin adminstrator : adminSet)

            if(adminstrator.getID()==ID)
            {
                return adminstrator;
            }
        return null;
    }

    @Override
    public Admin update(Admin admin) {

        Admin admin1 = read(admin.getID());
        if(adminSet != null)
        {
            adminSet.remove(admin1);
            adminSet.add(admin1);
            return admin;
        }
        return null;
    }

    @Override
    public boolean delete(Integer ID) {

        Admin delete = read(ID);
        if(delete == null)
            return false;
        adminSet.remove(delete);
        return true;
    }

    @Override
    public Set<Admin> getAll() {
        return adminSet;
    }
}
*/