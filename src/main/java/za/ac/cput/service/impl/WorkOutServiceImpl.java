//
//Hlumelo Mpotulo
//        215226348


package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.repository.impl.WorkOutRepository;
import java.util.Set;

@Service
class WorkOutServiceImpl implements WorkOutService
{
    private static WorkOutService workOutService;
    private final WorkOutRepository workOutRepository;

    public WorkOutServiceImpl() {
        this.workOutRepository = WorkOutRepository.getWorkOutRepository();
    }

    public WorkOutServiceImpl(WorkOutRepository workOutRepository) {
        this.workOutRepository = workOutRepository;
    }
    public static WorkOutService getInstance() {
        if(workOutService== null)
            workOutService = new WorkOutServiceImpl() {
                @Override
                public boolean delete(String s) {
                    return true;
                }
            };
        return workOutService;
    }
    @Override
    public static WorkOut create(WorkOut workOut) {
        System.out.println(workOut);
        return (WorkOut) WorkOutRepository.create(workOut);
    }

    @Override
    public WorkOut read(String s) {
        return null;
    }


    public static WorkOut read(Integer integer) {
        return WorkOutRepository.read(integer);
    }

    @Override
    public static WorkOut update(WorkOut workOut) {
        return WorkOutRepository.update(workOut);
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public static boolean delete(Integer WorkOutId) {
        WorkOutRepository.delete(WorkOutId);
        return !WorkOutRepository.delete(WorkOutId);
    }

    public static Set<WorkOut> getAll() {
        return WorkOutRepository.getAll();
    }
}
