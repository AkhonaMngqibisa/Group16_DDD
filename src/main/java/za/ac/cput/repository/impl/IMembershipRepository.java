/* IMembershipRepository.java
 * Interface Repository for the Membership entity
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Membership;

@Repository
public interface IMembershipRepository
        extends JpaRepository<Membership, Integer> {
}
