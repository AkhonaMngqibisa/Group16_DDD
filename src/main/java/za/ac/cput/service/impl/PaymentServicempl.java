package za.ac.cput.service.impl;

/* Admin.java
paymentServiceImpl for the Payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/


import za.ac.cput.entity.Payment;
import za.ac.cput.repository.impl.PaymentRespository;

import java.util.Set;

public class PaymentServicempl implements PaymentService{

    private static PaymentService payservice;
    private PaymentRespository paymentRep;


    public PaymentServicempl(PaymentRespository paymentRep) {
        this.paymentRep = paymentRep;
    }

    public PaymentServicempl() {
        this.paymentRep = PaymentRespository.getPaymentRep();
    }

    public static PaymentService getPayservice() {

        if(payservice== null)
            payservice=new PaymentServicempl();
        return payservice;
    }


    @Override
    public Payment create(Payment payment) {
      return this.paymentRep.create(payment);
    }

    @Override
    public Payment read(Integer paymentId) {
        return this.paymentRep.read(paymentId);
    }

    @Override
    public Payment update(Payment payment) {
        return this.paymentRep.update(payment);
    }

    @Override
    public boolean delete(Integer paymentId) {
        return this.delete(paymentId);
    }
    public Set<Payment> getAll(){ return this.paymentRep.getAll(); }
}
