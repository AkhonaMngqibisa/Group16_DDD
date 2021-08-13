package za.ac.cput.repository.impl;

/* Payment.java
Respository for the Admin
Author: Bongisa Mpahleni (216205999)
Date: August 2021
*/

import za.ac.cput.entity.Admin;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IAdminRespository extends IRepository<Admin, Integer> {
    Set<Admin> getAll();
}
