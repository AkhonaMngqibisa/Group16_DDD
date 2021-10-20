package za.ac.cput.service.impl;
//
//Hlumelo Mpotulo
//        215226348

import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.service.IService;
import java.util.Set;

public interface WorkOutScheduleService extends IService <WorkOutSchedule, Integer>
{
    static Set<WorkOutSchedule> getAll();
}