package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Gym;
import za.ac.cput.entity.Member;

import static org.junit.jupiter.api.Assertions.assertTrue;

/* GymFactoryTest.java
Test GymFactory
Author: Akhona Mngqibisa (217302394)
Date: 9 June 2021
*/
class GymFactoryTest
{
    @Test
    public void createGym()
    {
        Gym gym = GymFactory.createGym("Denis's Gym ", "Ny1 Cnr Ny6 Gugulethu");
        System.out.println(gym);

        assertTrue(gym instanceof Gym);
    }

}