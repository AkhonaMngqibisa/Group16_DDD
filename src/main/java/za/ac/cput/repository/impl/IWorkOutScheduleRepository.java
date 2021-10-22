package za.ac.cput.repository.impl;

/* Hlumelo Mpotulo
   215226348
   WorkOutSchedule IRepository

 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.repository.IRepository;
import java.util.Set;

@Repository
public interface IWorkOutScheduleRepository extends JpaRepository<WorkOutSchedule, Integer>
{
}