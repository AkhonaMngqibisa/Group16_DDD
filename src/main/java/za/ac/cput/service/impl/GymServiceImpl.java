package za.ac.cput.service.impl;
/* GymServiceImp.java
Implementation for the Gym Serve
Author: Akhona Mngqibisa (217302394)
Date: 29 July 2021
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Gym;
import za.ac.cput.repository.impl.IGymRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GymServiceImpl implements GymService {
    private static GymService gymservice= null;

    @Autowired
    private IGymRepository gymrepo;

    @Override
    public Gym create(Gym gym) {

        return this.gymrepo.save(gym);
    }

    @Override
    public Gym read(Integer gymId) {
        return this.gymrepo.findById(gymId).orElse(null);
    }

    @Override
    public Gym update(Gym gym) {
        if(this.gymrepo.existsById(gym.getGymID()))
        return this.gymrepo.save(gym);
       return null;
    }

    @Override
    public boolean delete(Integer gymId) {
        this.gymrepo.deleteById(gymId);
        if(this.gymrepo.existsById(gymId))
            return false;
        else

        return true;
    }

    @Override
    public Set<Gym> getAll()
    {
        return this.gymrepo.findAll().stream().collect(Collectors.toSet());
    }
}
