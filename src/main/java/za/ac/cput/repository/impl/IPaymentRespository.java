package za.ac.cput.repository.impl;

/* Payment.java
Respository for the Payment
Author: Bongisa Mpahleni (216205999)
Date: August  2021
*/

import za.ac.cput.entity.Payment;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IPaymentRespository extends IRepository<Payment, Integer> {
    Set<Payment> getAll();
}
