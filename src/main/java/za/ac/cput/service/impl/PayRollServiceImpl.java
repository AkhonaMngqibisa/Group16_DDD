package za.ac.cput.service.impl;
/* PayRollServiceImpl.java
 * Service implementation for PayRoll.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 01 August 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.PayRoll;
import za.ac.cput.repository.impl.IPayRollRepository;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PayRollServiceImpl implements PayRollService {
    private static PayRollService payRollservice= null;

    @Autowired
    private IPayRollRepository payRollRepository;

    @Override
    public PayRoll create(PayRoll payRoll) {

        return this.payRollRepository.save(payRoll);
    }

    @Override
    public PayRoll read(Integer payRollId) {
        return this.payRollRepository.findById(payRollId).orElse(null);
    }

    @Override
    public PayRoll update(PayRoll payRoll) {
        if(this.payRollRepository.existsById(payRoll.getPayrollID()))
            return this.payRollRepository.save(payRoll);
        return null;
    }

    @Override
    public boolean delete(Integer payRollId) {
        this.payRollRepository.deleteById(payRollId);
        if(this.payRollRepository.existsById(payRollId))
            return false;
        else

            return true;
    }

    @Override
    public Set<PayRoll> getAll()
    {
        return this.payRollRepository.findAll().stream().collect(Collectors.toSet());
    }
}

