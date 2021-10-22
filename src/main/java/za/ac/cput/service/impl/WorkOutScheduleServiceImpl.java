package za.ac.cput.service.impl;
//
//Hlumelo Mpotulo
//        215226348


import org.springframework.stereotype.Service;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.repository.impl.WorkOutScheduleRepository;
import java.util.Set;

@Service
class WorkOutScheduleImpl implements WorkOutScheduleService{

    private static WorkOutScheduleService workOutScheduleService;
    private final WorkOutScheduleRepository workOutScheduleRepository;

    public WorkOutScheduleImpl() {
        this.workOutScheduleRepository = WorkOutScheduleRepository.getRepository();
    }

    public WorkOutScheduleImpl(WorkOutScheduleRepository workOutScheduleRepository) {
        this.workOutScheduleRepository = workOutScheduleRepository;
    }

    public static WorkOutScheduleService getInstance() {
        if(workOutScheduleService== null)
            workOutScheduleService = new WorkOutScheduleImpl();
        return workOutScheduleService;
    }

    @Override
    public WorkOutSchedule create(WorkOutSchedule workOutSchedule) {
        System.out.println(workOutSchedule);
        return workOutScheduleRepository.create(workOutSchedule);
    }

    @Override
    public WorkOutSchedule read(Integer integer) {
        return workOutScheduleRepository.read(integer);
    }

    @Override
    public static WorkOutSchedule update(WorkOutSchedule workOutSchedule) {
        return WorkOutScheduleRepository.update(workOutSchedule);
    }

    @Override
    public boolean delete(Integer integer) {
        return workOutScheduleRepository.delete(integer);
    }

    public Set<WorkOutSchedule> getAll() {
        return WorkOutScheduleRepository.getAll();
    }
}
