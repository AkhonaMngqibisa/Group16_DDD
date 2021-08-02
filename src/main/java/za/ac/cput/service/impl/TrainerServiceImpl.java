/* TrainerServiceImpl.java
 * Service implementation for Trainer.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 01 August 2021
 */
package za.ac.cput.service.impl;

import za.ac.cput.entity.Trainer;
import za.ac.cput.repository.impl.TrainerRepository;
import java.util.Set;

public class TrainerServiceImpl implements TrainerService {
    private static TrainerService trainerService;
    private final TrainerRepository trainerRepository;

    public TrainerServiceImpl() {
        this.trainerRepository = TrainerRepository.getRepository();
    }

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public static TrainerService getInstance() {
        if(trainerService == null)
            trainerService = new TrainerServiceImpl();
        return trainerService;
    }

    @Override
    public Trainer create(Trainer trainer) {
        return trainerRepository.create(trainer);
    }

    @Override
    public Trainer read(Integer integer) {
        return trainerRepository.read(integer);
    }

    @Override
    public Trainer update(Trainer trainer) {
        return trainerRepository.update(trainer);
    }

    @Override
    public boolean delete(Integer integer) {
        return trainerRepository.delete(integer);
    }

    public Set<Trainer> getAll() {
        return trainerRepository.getAll();
    }
}
