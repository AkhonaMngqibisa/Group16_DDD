package za.ac.cput.entity;

/* GymTest.java
Testing Gym
Author: Akhona Mngqibisa (217302394)
Date: 09 June 2021
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GymTest
{
    @Test
    public void AddGymTest()
    {
        Gym gym = new Gym.Builder()
                .setGymName("Denis's Gym")
                .setGymAddress("Ny1 Cnr Ny6 Gugulethu")
                .build();

        System.out.println(gym);
    }

}