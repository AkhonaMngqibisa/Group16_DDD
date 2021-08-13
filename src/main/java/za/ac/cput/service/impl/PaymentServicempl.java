package za.ac.cput.service.impl;

import za.ac.cput.entity.Member;
import za.ac.cput.entity.Payment;
import za.ac.cput.repository.impl.PaymentRespository;

public class PaymentServicempl implements PaymentService{

    private static PaymentService payservice;
    private PaymentRespository paymentRep;

    @Override
    public Member create(Member member) {
        return null;
    }

    @Override
    public Payment create(Payment payment) {
        return null;
    }

    @Override
    public Member read(Integer integer) {
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        return null;
    }

    @Override
    public Member update(Member member) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
