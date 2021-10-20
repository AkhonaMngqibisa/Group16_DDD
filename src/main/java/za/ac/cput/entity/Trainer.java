package za.ac.cput.entity;
/* Trainer.java
Entity for the Trainer.
Author: Bokang Molaoa (218131097) ADP3 Assignment 3.
Date: 09 June 2021
*/
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Trainer")
public class Trainer {
    @Id
    private int trainerID;
    private String firstName, lastName, phoneNo, address;
    private String emailAddress,password;

    private Trainer() {}

    //Constructor
    private Trainer(Builder builder) {
        this.trainerID= builder.trainerID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNo = builder.phoneNo;
        this.address = builder.address;
        this.emailAddress = builder.emailAddress;
        this.password = builder.password;
    }
    public int getTrainerID() {
        return trainerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "Trainer{" +
                "trainerID=" + trainerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName, lastName, address, phoneNo, emailAddress,password;
        private int trainerID;

        //Set Trainer ID
        public Builder setTrainerID(int trainerID) {
            this.trainerID=trainerID;
            return this;
        }
        //Set First name
        public Builder setFirstName(String firstName) {
            this.firstName= firstName;
            return this;
        }
        //Set Last name
        public Builder setLastName(String lastName) {
            this.lastName= lastName;
            return this;
        }
        //Set Address
        public Builder setAddress(String address) {
            this.address= address;
            return this;
        }

        //Set Phone Number
        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo= phoneNo;
            return this;
        }

        //Set Email Address
        public Trainer.Builder setEmailAddress(String emailAddress) {
            this.emailAddress= emailAddress;
            return this;
        }
        //Set Password
        public Trainer.Builder setPassword(String password) {
            this.password= password;
            return this;
        }

        //Return instance of Trainer.
        public Trainer build() {
            return new Trainer(this);
        }

        //Copy method
        public Builder copy(Trainer trainer) {
            return this;
        }
    }
}
