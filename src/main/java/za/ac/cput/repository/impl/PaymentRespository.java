package za.ac.cput.repository.impl;

/* Admin.java
Respository for the Payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

/*
import za.ac.cput.entity.Payment;

import java.util.HashSet;
import java.util.Set;

public class PaymentRespository implements IPaymentRespository {

    private static PaymentRespository PaymentRep = null;
    private Set<Payment> PaymentSet;

    public PaymentRespository() {
        PaymentSet = new HashSet<>();
    }

    public static PaymentRespository getPaymentRep() {

        if(PaymentRep == null)
        {
            PaymentRep = new PaymentRespository();
        }
        return PaymentRep;
    }

    @Override
    public Payment create(Payment payment) {

        boolean added = PaymentSet.add(payment);
        if(!added)
            return null;

        return payment;
    }

    @Override
    public Payment read(Integer PaymentID) {

        for(Payment paym : PaymentSet)

            if(paym.getPaymentID()==PaymentID)
            {
                return paym;
            }
        return null;
    }

    @Override
    public Payment update(Payment payment) {

        Payment payment1 = read(payment.getPaymentID());
        if(PaymentSet != null)
        {
            PaymentSet.remove(payment1);
            PaymentSet.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(Integer paymentID) {

        Payment delete = read(paymentID);
        if(delete == null)
            return false;
        PaymentSet.remove(delete);
        return true;
    }

    @Override
    public Set<Payment> getAll() {
        return PaymentSet;
    }
}
*/