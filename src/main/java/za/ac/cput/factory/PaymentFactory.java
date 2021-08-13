package za.ac.cput.factory;

import za.ac.cput.entity.Payment;


import za.ac.cput.util.GenericHelper;
/* Admin.java
Factory for the payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/


public class PaymentFactory {


public static Payment creatPayment( double paymentAmount, String paymentDate){

int paymentID= GenericHelper.generateId();

    Payment payment= new Payment.Builder()
            .setPaymentID(paymentID)
            .setPaymentAmount(paymentAmount)
            .setpayMentDate(paymentDate)
            .build();



    return payment;
}

}
