/* PayRollRepository.java
 * Class Repository for PayRoll Repository.
 * Author: Bokang Molaoa [218131097]
 * Date: 24 July 2021.
 */
package za.ac.cput.repository;
import za.ac.cput.entity.PayRoll;

import java.util.HashSet;
import java.util.Set;

public class PayRollRepository implements IPayRollRepository {
    private static PayRollRepository payRollRep = null;
    private Set<PayRoll> payRollSet = null;

    private PayRollRepository() {
        payRollSet = new HashSet<>();
    }

    public static PayRollRepository getRepository() {
        if(payRollRep == null) {
            payRollRep = new PayRollRepository();
        }
        return payRollRep;
    }

    @Override
    public PayRoll create(PayRoll payRoll)
    {
        boolean success = payRollSet.add(payRoll);
        if(!success)
            return null;
        return payRoll;
    }

    @Override
    public PayRoll read(Integer payRollId) {
        return null;
    }

    @Override
    public PayRoll read(String trainerId) {
        for(PayRoll payRoll : payRollSet)

            if(payRoll.getPayrollID()== payRoll.getPayrollID()) {
                return payRoll;
            }
        return null;
    }

    @Override
    public PayRoll update(PayRoll payRoll)
    {
        PayRoll payRoll1 = read(payRoll.getPayrollID());
        if(payRoll1 != null)
        {
            payRollSet.remove(payRoll1);
            payRollSet.add(payRoll);
            return payRoll;
        }
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    public boolean delete(String payRollId)
    {
        PayRoll payRollRemove = read(payRollId);
        if(payRollRemove == null)
            return false;
        payRollSet.remove(payRollRemove);
        return true;
    }

    @Override
    public Set<PayRoll> getAll() {
        return payRollSet;
    }
}
