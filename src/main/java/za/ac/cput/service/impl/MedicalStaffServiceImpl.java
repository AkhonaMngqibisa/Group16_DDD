/* MedicalStaffServiceImpl.java
 * Service implementation for MedicalStaff
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 30 July 2021
 */

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.repository.impl.IMedicalStaffRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class MedicalStaffServiceImpl implements MedicalStaffService{
//    private static MedicalStaffService medicalStaffService = null;

    @Autowired
    private IMedicalStaffRepository medicalStaffRepository;

    @Override
    public MedicalStaff create(MedicalStaff medicalStaff) {
        return medicalStaffRepository.save(medicalStaff);
    }

    @Override
    public MedicalStaff read(Integer medicalStaffId) {
        return medicalStaffRepository.findById(medicalStaffId).orElse(null);
    }

    @Override
    public MedicalStaff update(MedicalStaff medicalStaff) {
        if (medicalStaffRepository.existsById(medicalStaff.getId()))
            return medicalStaffRepository.save(medicalStaff);
        return null;
    }

    @Override
    public boolean delete(Integer medicalStaffId) {
        medicalStaffRepository.deleteById(medicalStaffId);
        return !medicalStaffRepository.existsById(medicalStaffId);
    }

    public Set<MedicalStaff> getAll() {
        return new HashSet<>(medicalStaffRepository.findAll());
    }
}
