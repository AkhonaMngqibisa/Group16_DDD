package za.ac.cput.Factory;

import za.ac.cput.Entity.Payment;


import za.ac.cput.Util.GenericHelper;

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
