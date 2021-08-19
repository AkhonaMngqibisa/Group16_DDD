/* PayRollServiceImpl.java
 * Service implementation for PayRoll.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 01 August 2021
 */
package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.entity.PayRoll;
import za.ac.cput.entity.Trainer;
import za.ac.cput.repository.IRepository;
import za.ac.cput.repository.impl.IPayRollRepository;
import za.ac.cput.repository.impl.PayRollRepository;
import java.util.Set;

@Service
public class PayRollServiceImpl implements PayRollService {
    private static PayRollService payRollService;
    private final PayRollRepository payRollRepository;

    public PayRollServiceImpl() {
        this.payRollRepository = PayRollRepository.getRepository();
    }

    public PayRollServiceImpl(PayRollRepository payRollRepository) {
        this.payRollRepository = payRollRepository;
    }

    public static PayRollService getInstance() {
        if(payRollService == null)
            payRollService = new PayRollServiceImpl();
        return payRollService;
    }
    @Override
    public PayRoll create(PayRoll payRoll) {
        return payRollRepository.create(payRoll);
    }

    @Override
    public PayRoll read(Integer integer) { return payRollRepository.read(integer); }

    @Override
    public PayRoll update(PayRoll payRoll) {
        return payRollRepository.update(payRoll);
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public boolean delete(String integer) { return payRollRepository.delete(integer); }

    public Set<PayRoll> getAll() {
        return payRollRepository.getAll();
    }
}

