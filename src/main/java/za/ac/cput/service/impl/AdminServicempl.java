package za.ac.cput.service.impl;

/* Admin.java
AdminServiceImpl for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import za.ac.cput.entity.Admin;
import za.ac.cput.repository.impl.IAdminRespository;

import java.util.Set;

public class AdminServicempl implements AdminService{


    private IAdminRespository adminrep;

    @Override
    public Admin create(Admin admin) {
        return this.adminrep.create(admin);
    }

    @Override
    public Admin read(Integer Id) {
        return this.adminrep.read(Id);
    }

    @Override
    public Admin update(Admin admin) {
        return this.adminrep.update(admin);
    }

    @Override
    public boolean delete(Integer Id) {
        return this.delete(Id);
    }
    public Set<Admin> getAll(){ return this.adminrep.getAll(); }
}
