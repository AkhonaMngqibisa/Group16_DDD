package za.ac.cput.repository.impl;

/* Payment.java
Respository for the Payment
Author: Bongisa Mpahleni (216205999)
Date: August  2021
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Payment;

import java.util.Set;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Integer> {

}
