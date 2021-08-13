package za.ac.cput.service.impl;

/* Admin.java
AdminService for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import za.ac.cput.entity.Admin;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AdminService extends IService<Admin, Integer> {
    Set<Admin> getAll();
}
