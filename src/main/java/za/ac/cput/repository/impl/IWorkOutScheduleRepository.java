package za.ac.cput.repository.impl;

/* Hlumelo Mpotulo
   215226348
   WorkOutSchedule IRepository

 */

import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.repository.IRepository;
import java.util.Set;

public interface IWorkOutScheduleRepository extends IRepository <WorkOutSchedule, Integer>
{
    Set<WorkOutSchedule> getAll();
}
