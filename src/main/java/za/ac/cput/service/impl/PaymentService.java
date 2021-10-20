package za.ac.cput.service.impl;

/* Admin.java
paymentService for the Payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import za.ac.cput.entity.Payment;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PaymentService extends IService<Payment, Integer> {
   Set<Payment> getAll();
}
