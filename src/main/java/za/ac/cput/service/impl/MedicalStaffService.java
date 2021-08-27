/* MedicalStaffService.java
 * Service for MedicalStaff
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 30 July 2021
 */

package za.ac.cput.service.impl;

import za.ac.cput.service.IService;
import za.ac.cput.entity.MedicalStaff;

import java.util.Set;

public interface MedicalStaffService extends IService<MedicalStaff, Integer> {
    Set<MedicalStaff> getAll();
}
