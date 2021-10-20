package za.ac.cput.service.impl;

//
//Hlumelo Mpotulo
//        215226348


import za.ac.cput.entity.WorkOut;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.service.IService;
import java.util.Set;

public interface WorkOutService extends IService <WorkOut, String>{
    boolean delete(Integer WorkOutId);

    public Set<WorkOutSchedule> getAll ();
}
