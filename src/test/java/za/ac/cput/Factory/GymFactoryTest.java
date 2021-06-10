package za.ac.cput.Factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Gym;

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
    }

}