package za.ac.cput.repository.impl;
/* IPayRollRepository.java
 * Interface Repository for PayRoll entity.
 * Author: Bokang Molaoa [218131097]
 * Date: 24 July 2021
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.PayRoll;

@Repository
public interface IPayRollRepository extends JpaRepository<PayRoll, Integer> {

}

