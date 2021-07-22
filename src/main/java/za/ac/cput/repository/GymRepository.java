package za.ac.cput.repository;

import za.ac.cput.entity.Gym;

import java.util.HashSet;
import java.util.Set;

public class GymRepository implements IGymRepository {

private static GymRepository gymRep = null;
private Set<Gym> gymSet = null;

private GymRepository()
{
    gymSet = new HashSet<>();
}

public static GymRepository getGymRep()
{
    if(gymRep == null)
    {
        gymRep = new GymRepository();
    }
    return gymRep;
}

@Override
public Gym create(Gym gym)
{
    boolean success = gymSet.add(gym);
    if(!success)
        return null;

    return gym;
}

@Override
public Gym read(Integer gymId)
{
    for(Gym g : gymSet)

        if(g.getGymID()==gymId)
        {
            return g;
        }
        return null;
}

@Override
public Gym update(Gym gym)
{
    Gym gym1 = read(gym.getGymID());
    if(gym1 != null)
    {
        gymSet.remove(gym1);
        gymSet.add(gym);
        return gym;
    }
    return null;
}

@Override
public boolean delete(Integer gymId)
{
    Gym gymToDelete = read(gymId);
    if(gymToDelete == null)
        return false;
    gymSet.remove(gymToDelete);
    return true;
}

@Override
    public Set<Gym> getAll() {
        return gymSet;
    }
}
