package za.ac.cput.Entity;
/* Trainer.java
Entity for the Trainer.
Author: Bokang Molaoa (218131097)
Date: 09 June 2021
*/

public class Trainer {
    private int trainerID;
    private String firstName, lastName, phoneNo, address;
    private String emailAddress,password;

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

    public void Login() {
        System.out.println("Successfully login");
    }

    public static class Builder {
        private String firstName, lastName, address, phoneNo, status, emailAddress,password;
        private int trainerID, age;

        //Set Member ID
        public Builder setMemberID(int memberID) {
            this.trainerID=memberID;
            return this;
        }
        //Set Firstname
        public Builder setFirstName(String firstName) {
            this.firstName= firstName;
            return this;
        }
        //Set Lastname
        public Builder setLastName(String lastName) {
            this.lastName= lastName;
            return this;
        }
        //Set Address
        public Builder setAddress(String address) {
            this.address= address;
            return this;
        }

        //Set PhoneNumber
        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo= phoneNo;
            return this;
        }

        //Set status
        public Trainer.Builder setStatus(String status) {
            this.status= status;
            return this;
        }

        //Set EmailAddress
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
