/* MedicalStaffServiceImpl.java
 * Service implementation for MedicalStaff
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 30 July 2021
 */

package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.repository.impl.MedicalStaffRepository;
import java.util.Set;

@Service
public class MedicalStaffServiceImpl implements MedicalStaffService{
    private static MedicalStaffService medicalStaffService;
    private final MedicalStaffRepository medicalStaffRepository;

    public MedicalStaffServiceImpl() {
        this.medicalStaffRepository = MedicalStaffRepository.getRepository();
    }

    public MedicalStaffServiceImpl(MedicalStaffRepository medicalStaffRepository) {
        this.medicalStaffRepository = medicalStaffRepository;
    }

    public static MedicalStaffService getInstance() {
        if(medicalStaffService== null)
            medicalStaffService = new MedicalStaffServiceImpl();
        return medicalStaffService;
    }

    @Override
    public MedicalStaff create(MedicalStaff medicalStaff) {
        System.out.println(medicalStaff);
        return medicalStaffRepository.create(medicalStaff);
    }

    @Override
    public MedicalStaff read(Integer integer) {
        return medicalStaffRepository.read(integer);
    }

    @Override
    public MedicalStaff update(MedicalStaff medicalStaff) {
        return medicalStaffRepository.update(medicalStaff);
    }

    @Override
    public boolean delete(Integer integer) {
        return medicalStaffRepository.delete(integer);
    }

    public Set<MedicalStaff> getAll() {
        return medicalStaffRepository.getAll();
    }
}
