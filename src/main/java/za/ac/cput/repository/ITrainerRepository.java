/* ITrainerRepository.java
 * Interface Repository for Trainer entity.
 * Author: Bokang Molaoa [218131097]
 * Date: 24 July 2021
 */
package za.ac.cput.repository;
import za.ac.cput.entity.Trainer;

import java.util.Set;

public interface ITrainerRepository extends IRepository<Trainer, Integer> {
    Set<Trainer> getAll();
}


