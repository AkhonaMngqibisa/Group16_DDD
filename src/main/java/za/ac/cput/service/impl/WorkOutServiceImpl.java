//
//Hlumelo Mpotulo
//        215226348


package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.repository.impl.IWorkOutRepository;

import java.util.HashSet;
import java.util.Set;

@Service
class WorkOutServiceImpl implements WorkOutService
{
    @Autowired
    private IWorkOutRepository workOutRepository;

    public WorkOutServiceImpl() {}

    @Override
    public WorkOut create(WorkOut workOut) {
        return workOutRepository.save(workOut);
    }

    @Override
    public WorkOut read(Integer s) {
        return this.workOutRepository.findById(s).orElse(null);
    }

    @Override
    public WorkOut update(WorkOut workOut) {
        if(this.workOutRepository.existsById(workOut.getWorkoutId()))
            return this.workOutRepository.save(workOut);
        return null;
    }

    @Override
    public boolean delete(Integer WorkOutId) {
        workOutRepository.deleteById(WorkOutId);
        return !workOutRepository.existsById(WorkOutId);
    }

    @Override
    public Set<WorkOut> getAll() {
        return new HashSet<>(this.workOutRepository.findAll());
    }
}