package za.ac.cput.factory;
import za.ac.cput.entity.Gym;
import za.ac.cput.util.GenericHelper;

/* GymFactory.java
Factory for the Gym
Author: Akhona Mngqibisa (217302394)
Date: 9 June 2021
*/
public class GymFactory
{
    public static Gym createGym(String gymName, String gymAddress)
    {
        int gymID= GenericHelper.generateId();
        Gym gym= new Gym.Builder()
                .setGymID(gymID)
                .setGymName(gymName)
                .setGymAddress(gymAddress)
                .build();

        return gym;

    }

}