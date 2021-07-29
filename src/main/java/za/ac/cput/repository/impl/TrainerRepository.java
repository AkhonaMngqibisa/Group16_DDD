/* TrainerRepository.java
 * Class Repository for Trainer Repository.
 * Author: Bokang Molaoa [218131097]
 * Date: 24 July 2021.
 */
package za.ac.cput.repository.impl;
import za.ac.cput.entity.Trainer;

import java.util.HashSet;
import java.util.Set;

public class TrainerRepository implements ITrainerRepository {

    private static TrainerRepository trainerRep = null;
    private Set<Trainer> trainerSet;

    private TrainerRepository() {
        trainerSet = new HashSet<>();
    }
    public static TrainerRepository getRepository() {
        if (trainerRep == null) {
            trainerRep = new TrainerRepository();
        }
        return trainerRep;
    }
    @Override
    public Trainer create(Trainer trainer) {
        boolean success = trainerSet.add(trainer);
        if(!success)
            return null;

        return trainer;
    }
    @Override
    public Trainer read(Integer trainerId) {
        for(Trainer trainer : trainerSet)

            if(trainer.getTrainerID()==trainerId) {
                return trainer;
            }
        return null;
    }
    @Override
    public Trainer update(Trainer trainer) {
        Trainer trainer1 = read(trainer.getTrainerID());
        if(trainer1 != null) {
            trainerSet.remove(trainer1);
            trainerSet.add(trainer);
            return trainer;
        }
        return null;
    }

    @Override
    public boolean delete(Integer trainerId) {
        Trainer trainerRemove = read(trainerId);
        if(trainerRemove == null)
            return false;
        trainerSet.remove(trainerRemove);
        return true;
    }

    @Override
    public Set<Trainer> getAll() {
        return trainerSet;
    }
}