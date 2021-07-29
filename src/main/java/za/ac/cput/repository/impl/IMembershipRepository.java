/* IMembershipRepository.java
 * Interface Repository for the Membership entity
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository.impl;

import za.ac.cput.entity.Membership;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IMembershipRepository extends IRepository<Membership, Integer> {
    Set<Membership> getAll();
}
