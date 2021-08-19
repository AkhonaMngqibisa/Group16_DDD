/* TrainerController.java
 * Controller for Trainer.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 15 August 2021
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Trainer;
import za.ac.cput.factory.TrainerFactory;
import za.ac.cput.service.impl.TrainerService;
import java.util.Set;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create") // It's a bit simpler:
    public Trainer create(@RequestBody Trainer trainer) {
        Trainer newTrainer = TrainerFactory.createTrainer(trainer.getFirstName(), trainer.getLastName(),
                trainer.getPhoneNo(), trainer.getAddress(), trainer.getEmailAddress(), trainer.getPassword());
        return trainerService.create(newTrainer);
    }

    @GetMapping("/read/{id}")
    public Trainer read(@PathVariable int id)
    {
        return trainerService.read(id);
    }

    @PostMapping("/update")
    public Trainer update(@RequestBody Trainer trainer)
    {
        return trainerService.update(trainer);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return trainerService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Trainer> getAll()
    {
        return trainerService.getAll();
    }
}


