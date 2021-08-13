package za.ac.cput.service.impl;

/* Admin.java
AdminServiceImpl for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import za.ac.cput.entity.Admin;
import za.ac.cput.repository.impl.AdminRespository;

import java.util.Set;

public class AdminServicempl implements AdminService{

    private static AdminService adminService;
    private AdminRespository adminrep;


    public AdminServicempl(AdminRespository adminrep) {
        this.adminrep = adminrep;
    }

    public AdminServicempl() {
        this.adminrep = AdminRespository.getAdminRep();
    }

    public static AdminService getAdminService() {

        if(adminService== null)
            adminService=new AdminServicempl();
        return adminService;
    }

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
