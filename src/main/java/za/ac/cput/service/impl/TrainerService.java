package za.ac.cput.service.impl;
/* TrainerService.java
 * Service implementation for Trainer.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 01 August 2021
 */
import za.ac.cput.entity.Trainer;
import za.ac.cput.service.IService;

import java.util.Set;

public interface TrainerService extends IService<Trainer, Integer> {
    public Set<Trainer> getAll();
}