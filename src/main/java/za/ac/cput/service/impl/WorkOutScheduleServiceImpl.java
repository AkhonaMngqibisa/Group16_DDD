//
//Hlumelo Mpotulo
//        215226348


package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.repository.impl.IWorkOutScheduleRepository;

import java.util.HashSet;
import java.util.Set;

@Service
class WorkOutScheduleServiceImpl implements WorkOutScheduleService
{
    @Autowired
    private IWorkOutScheduleRepository workOutScheduleRepository;

    public WorkOutScheduleServiceImpl() {}

    @Override
    public WorkOutSchedule create(WorkOutSchedule workOutSchedule) {
        return workOutScheduleRepository.save(workOutSchedule);
    }

    @Override
    public WorkOutSchedule read(Integer s) {
        return this.workOutScheduleRepository.findById(s).orElse(null);
    }

    @Override
    public WorkOutSchedule update(WorkOutSchedule workOutSchedule) {
        if(this.workOutScheduleRepository.existsById(workOutSchedule.getWorkoutId()))
            return this.workOutScheduleRepository.save(workOutSchedule);
        return null;
    }

    @Override
    public boolean delete(Integer WorkOutScheduleId) {
        workOutScheduleRepository.deleteById(WorkOutScheduleId);
        return !workOutScheduleRepository.existsById(WorkOutScheduleId);
    }

    @Override
    public Set<WorkOutSchedule> getAll() {
        return new HashSet<>(this.workOutScheduleRepository.findAll());
    }
}