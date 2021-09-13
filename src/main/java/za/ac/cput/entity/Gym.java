package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/* Gym.java
Entity for the Gym
Author: Akhona Mngqibisa (217302394)
Date: 09 June 2021
*/

@Entity
@Table(name="Gym")
public class Gym
{
    @Id
    private int gymID;

    private String gymName, gymAddress;


    public Gym(Builder builder)
    {
        this.gymID= builder.gymID;
        this.gymName= builder.gymName;
        this.gymAddress = builder.gymAddress;
    }
    public Gym() {
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
