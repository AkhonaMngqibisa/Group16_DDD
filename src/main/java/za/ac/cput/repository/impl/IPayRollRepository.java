/* IPayRollRepository.java
 * Interface Repository for PayRoll entity.
 * Author: Bokang Molaoa [218131097]
 * Date: 24 July 2021
 */
package za.ac.cput.repository.impl;
import za.ac.cput.entity.PayRoll;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IPayRollRepository extends IRepository<PayRoll, Integer> {
    PayRoll read(String trainerId);

    Set<PayRoll> getAll();
}

