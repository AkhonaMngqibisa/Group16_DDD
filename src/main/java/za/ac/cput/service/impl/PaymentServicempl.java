package za.ac.cput.service.impl;

/* Admin.java
paymentServiceImpl for the Payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Payment;
import za.ac.cput.repository.impl.IPaymentRepository;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaymentServicempl implements PaymentService{


    @Autowired
    private IPaymentRepository paymentRep;

    @Override
    public Payment create(Payment payment) {
      return this.paymentRep.save(payment);
    }

    @Override
    public Payment read(Integer paymentId) {
        return this.paymentRep.findById(paymentId).orElse(null);
    }

    @Override
    public Payment update(Payment payment) {
        if(this.paymentRep.existsById(payment.getPaymentID()))
            return this.paymentRep.save(payment);
        return null;
    }

    @Override
    public boolean delete(Integer paymentId) {
        this.paymentRep.deleteById(paymentId);
        if(this.paymentRep.existsById(paymentId))
            return false;
        else

            return true;
    }

    @Override
    public Set<Payment> getAll(){ return this.paymentRep.findAll().stream().collect(Collectors.toSet());
    }
}
