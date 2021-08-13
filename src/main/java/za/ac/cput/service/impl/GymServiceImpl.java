package za.ac.cput.service.impl;
/* GymServiceImp.java
Implementation for the Gym Serve
Author: Akhona Mngqibisa (217302394)
Date: 29 July 2021
*/
import za.ac.cput.entity.Gym;
import za.ac.cput.repository.impl.GymRepository;

import java.util.Set;

public class GymServiceImpl implements GymService {
    private static GymService gymservice;
    private GymRepository  gymrepo;

    public GymServiceImpl(GymRepository gymrepo) {
        this.gymrepo = gymrepo;
    }

    public GymServiceImpl() {
        this.gymrepo = GymRepository.getGymRep();
    }

    public static GymService getGymservice() {

        if(gymservice== null)
            gymservice=new GymServiceImpl();
        return gymservice;
    }

    @Override
    public Gym create(Gym gym) {
        return this.gymrepo.create(gym);
    }

    @Override
    public Gym read(Integer gymId) {
        return this.gymrepo.read(gymId);
    }

    @Override
    public Gym update(Gym gym) {
        return this.gymrepo.update(gym);
    }

    @Override
    public boolean delete(Integer gymId) {

        return this.gymrepo.delete(gymId);
    }
    public Set<Gym> getAll()
    {
        return this.gymrepo.getAll();
    }
}
