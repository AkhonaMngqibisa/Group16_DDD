package za.ac.cput.entity;

import java.util.ArrayList;
import java.util.List;

/* Gym.java
Entity for the Gym
Author: Akhona Mngqibisa (217302394)
Date: 09 June 2021
*/
public class Gym
{
    private int gymID;
    private String gymName, gymAddress;
    List<Gym> gymList = new ArrayList<>();

    //Constructor


    public Gym() {
    }

    private Gym(Builder builder)
    {
        this.gymID= builder.gymID;
        this.gymName= builder.gymName;
        this.gymAddress = builder.gymAddress;
    }

    public int getGymID() {
        return gymID;
    }

    public String getGymName() {
        return gymName;
    }

    public String getGymAddress() {
        return gymAddress;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "gymID=" + gymID +
                ", gymName='" + gymName + '\'' +
                ", gymAddress='" + gymAddress + '\'' +
                '}';
    }

    //Searching for gym
    public List<Gym> FindGym()
    {
        for(int i =0; i<51; i++)
        {
            Gym gym = new Gym(new Gym.Builder());
            gymList.contains(gym);
        }
        return gymList;
    }

    public static class Builder
    {
        private String gymName, gymAddress;
        private int gymID;

        //Set Gym ID
        public Builder setGymID(int gymID)
        {
            this.gymID=gymID;
            return this;
        }
        //Set Gym name
        public Builder setGymName(String gymName)
        {
            this.gymName= gymName;
            return this;
        }
        //Set Address
        public Builder setGymAddress(String gymAddress)
        {
            this.gymAddress= gymAddress;
            return this;
        }


        //Return instance of gym
        public Gym build()
        {
            return new Gym(this);
        }

        //Copy method
        public Builder copy(Gym gym)
        {
            this.gymID= gym.gymID;
            this.gymName= gym.gymName;
            this.gymAddress=gym.gymAddress;

            return this;
        }

    }

}
