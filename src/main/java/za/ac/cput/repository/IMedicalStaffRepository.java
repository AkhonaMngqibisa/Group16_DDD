/* IMedicalStaffRepository.java
 * Interface Repository for the MedicalStaff entity
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository;

import za.ac.cput.entity.MedicalStaff;

import java.util.Set;

public interface IMedicalStaffRepository extends IRepository<MedicalStaff, Integer> {
    Set<MedicalStaff> getAll();
}
