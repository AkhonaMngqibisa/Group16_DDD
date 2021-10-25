package za.ac.cput.service.impl;

/* Admin.java
AdminServiceImpl for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Admin;
import za.ac.cput.entity.Member;
import za.ac.cput.repository.impl.IAdminRespository;
import za.ac.cput.repository.impl.IMemberRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AdminServicempl implements AdminService{


    @Autowired
    private IAdminRespository  adminrepo;

    @Override
    public Admin create(Admin admin) {

        return this.adminrepo.save(admin);
    }

    @Override
    public Admin read(Integer Id) {
        return this.adminrepo.findById(Id).orElse(null);
    }

    @Override
    public Admin update(Admin admin) {
        if(this.adminrepo.existsById(admin.getID()))
            return this.adminrepo.save(admin);
        return null;
    }

    @Override
    public boolean delete(Integer ID) {
        this.adminrepo.deleteById(ID);
        if(this.adminrepo.existsById(ID))
            return false;
        else

            return true;
    }

    @Override
    public Set<Admin> getAll()
    {
        return this.adminrepo.findAll().stream().collect(Collectors.toSet());
    }
}
