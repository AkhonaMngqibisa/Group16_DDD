package za.ac.cput.factory;

import za.ac.cput.entity.Payment;


import za.ac.cput.util.GenericHelper;

public class PaymentFactory {


public static Payment creatPayment( int paymentID, int memberID, double paymentAmount, String paymentDate){

int payMentID= GenericHelper.generateId();
int membeerID= GenericHelper.generateId();


    Payment payment= new Payment.Builder()
            .setPaymentID(payMentID)
            .setMemberID(membeerID)
            .setPaymentAmount(paymentAmount)
            .setpayMentDate(paymentDate)
            .build();



    return payment;
}

}
