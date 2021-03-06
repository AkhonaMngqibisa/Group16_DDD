/* IMedicalStaffRepository.java
 * Interface Repository for the MedicalStaff entity
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.MedicalStaff;

@Repository
public interface IMedicalStaffRepository
        extends JpaRepository<MedicalStaff, Integer> {
}
