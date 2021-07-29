/* MedicalStaffRepository.java
 * Class Repository for MedicalStaff
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository.impl;

import za.ac.cput.entity.MedicalStaff;

import java.util.HashSet;
import java.util.Set;

public class MedicalStaffRepository implements IMedicalStaffRepository {

    private static MedicalStaffRepository medicalStaffRep = null;
    private Set<MedicalStaff> medicalStaffSet;

    private MedicalStaffRepository()
    {
        medicalStaffSet = new HashSet<>();
    }

    public static MedicalStaffRepository getRepository()
    {
        if(medicalStaffRep == null)
        {
            medicalStaffRep = new MedicalStaffRepository();
        }
        return medicalStaffRep;
    }

    @Override
    public MedicalStaff create(MedicalStaff medicalStaff)
    {
        boolean success = medicalStaffSet.add(medicalStaff);
        if(!success)
            return null;

        return medicalStaff;
    }

    @Override
    public MedicalStaff read(Integer medicalStaffId)
    {
        for(MedicalStaff ms : medicalStaffSet)

            if(ms.getId()==medicalStaffId)
            {
                return ms;
            }
            return null;
    }

    @Override
    public MedicalStaff update(MedicalStaff medicalStaff)
    {
        MedicalStaff _medicalStaff = read(medicalStaff.getId());
        if(_medicalStaff != null)
        {
            medicalStaffSet.remove(_medicalStaff);
            medicalStaffSet.add(medicalStaff);
            return medicalStaff;
        }
        return null;
    }

    @Override
    public boolean delete(Integer medicalStaffId)
    {
        MedicalStaff delete = read(medicalStaffId);
        if(delete == null)
            return false;
        medicalStaffSet.remove(delete);
        return true;
    }

    @Override
    public Set<MedicalStaff> getAll() {
        return medicalStaffSet;
    }
}
