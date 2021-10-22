package za.ac.cput.service.impl;
/* TrainerServiceImpl.java
 * Service implementation for Trainer.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 01 August 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Trainer;
import za.ac.cput.repository.impl.ITrainerRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    private ITrainerRepository trainerRepository;

    public TrainerServiceImpl() {
    }

    @Override
    public Trainer create(Trainer trainer) {

        return this.trainerRepository.save(trainer);
    }

    @Override
    public Trainer read(Integer trainerId) {
        return this.trainerRepository.findById(trainerId).orElse(null);
    }

    @Override
    public Trainer update(Trainer trainer) {
        if(this.trainerRepository.existsById(trainer.getTrainerID()))
            return this.trainerRepository.save(trainer);
        return null;
    }

    @Override
    public boolean delete(Integer supId) {
        this.trainerRepository.deleteById(supId);
        if(this.trainerRepository.existsById(supId))
            return false;
        else

            return true;
    }

    @Override
    public Set<Trainer> getAll()
    {
        return this.trainerRepository.findAll().stream().collect(Collectors.toSet());
    }


}
