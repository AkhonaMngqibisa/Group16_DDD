package za.ac.cput.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Admin.java
Entity for the Admin
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/
@Entity
@Table(name="Admin")
public class Admin {

    @Id
    private String fisrtName;
    private String lastName;
    private String phoneNo;
    private String emailAddress;
    private int ID;

    public Admin(Builder builder) {
        this.ID = builder.ID;
        this.fisrtName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNo = builder.phoneNo;
        this.emailAddress = builder.emailAddress;
    }

    public Admin() {

    }

    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public static class Builder
    {

        private String firstName,lastName,phoneNo,emailAddress;
        private int ID;

        public Builder setID(int ID) {
            this.ID = ID;
            return this;
        }

        //Set Firstname
        public Builder setFirstName(String firstName)
        {
            this.firstName= firstName;
            return this;
        }
        //Set Lastname
        public Builder setLastName(String lastName)
        {
            this.lastName= lastName;
            return this;
        }

        //Set PhoneNumber
        public Builder setPhoneNo(String phoneNo)
        {
            this.phoneNo= phoneNo;
            return this;
        }

        //Set EmailAddress
        public Builder setEmailAddress(String emailAddress)
        {
            this.emailAddress= emailAddress;
            return this;
        }



        public Admin build()
        {
            return new Admin(this);
        }

        //Copy method
        public Builder copy(Admin admin)
        {
            this.ID = admin.ID;
            this.firstName= admin.fisrtName;
            this.lastName=admin.lastName;
            this.phoneNo=admin.phoneNo;
            this.emailAddress=admin.emailAddress;


            return this;
        }

    }


}