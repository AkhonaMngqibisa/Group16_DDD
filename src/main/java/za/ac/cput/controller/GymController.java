package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Gym;
import za.ac.cput.factory.GymFactory;
import za.ac.cput.service.impl.GymService;
import java.util.Set;

/* GymController.java
Controller for the Gym
Author: Akhona Mngqibisa (217302394)
Date:15 August 2021
*/

@Controller
@RequestMapping("/gym")
public class GymController {

    @Autowired
    private GymService gymService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)

    public Gym create(@RequestBody Gym gym)
    {
        Gym newGym = GymFactory.createGym(gym.getGymName(),gym.getGymAddress());
        return gymService.create(newGym);
    }

    @GetMapping("/read/{id}")
    public Gym read(@PathVariable int id)
    {
        return gymService.read(id);
    }

    @PostMapping("/update")
    public Gym update(@RequestBody Gym gym)
    {
        return gymService.update(gym);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return gymService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Gym> getAll()
    {
        return gymService.getAll();
    }

}
