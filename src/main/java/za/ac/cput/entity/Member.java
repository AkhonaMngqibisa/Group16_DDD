package za.ac.cput.entity;
/* Member.java
Entity for the Member
Author: Akhona Mngqibisa (217302394)
Date: 09 June 2021
*/

import java.util.ArrayList;
import java.util.List;

public class Member
{
    private int memberID;
    private String firstName, lastName, address, phoneNo, status;
    private int age;
    private String emailAddress,password;
    List<Member> memberList = new ArrayList<>();

    //Constructor
    public Member(Builder builder)
    {
        this.memberID= builder.memberID;
        this.firstName= builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phoneNo = builder.phoneNo;
        this.age = builder.age;
        this.status = builder.status;
        this.emailAddress = builder.emailAddress;
        this.password = builder.password;
    }

    public Member() {

    }

    public int getMemberID() {
        return memberID;
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

    public String getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", status='" + status + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", memberList=" + memberList +
                '}';
    }

    public void Login()
    {
        System.out.println("Successfully login");
    }

    public List<Member> AddMember()
    {

            Member member = new Member(new Builder());
            memberList.add(member);


        return memberList;
    }

    public List<Member> EditMember()
    {
        AddMember();
        for(int i =0; i<1; i++)
        {
            Member member = new Member(new Builder());
            memberList.contains(member);
        }
        return memberList;
    }
    public List<Member> DeleteMember()
    {
        AddMember();

            Member member = new Member(new Builder());
            memberList.remove(0);

        return memberList;
    }

    public static class Builder
    {
        private String firstName, lastName, address, phoneNo, status, emailAddress,password;
        private int memberID, age;

        //Set Member ID
        public Builder setMemberID(int memberID)
        {
            this.memberID=memberID;
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
        //Set Address
        public Builder setAddress(String address)
        {
            this.address= address;
            return this;
        }

        //Set PhoneNumber
        public Builder setPhoneNo(String phoneNo)
        {
            this.phoneNo= phoneNo;
            return this;
        }

       //Set age
        public Builder setAge(int age)
        {
                this.age= age;
                return this;
        }

        //Set status
        public Builder setStatus(String status)
        {
            this.status= status;
            return this;
        }

        //Set EmailAddress
        public Builder setEmailAddress(String emailAddress)
        {
            this.emailAddress= emailAddress;
            return this;
        }
        //Set Password
        public Builder setPassword(String password)
        {
            this.password= password;
            return this;
        }

        //Return instance of customer
        public Member build()
        {
            return new Member(this);
        }

        //Copy method
        public Builder copy(Member member)
        {
            this.memberID= member.memberID;
            this.firstName= member.firstName;
            this.lastName=member.lastName;
            this.address=member.address;
            this.phoneNo=member.phoneNo;
            this.age=member.age;
            this.status=member.status;
            this.emailAddress=member.emailAddress;
            this.password=member.password;

            return this;
        }


    }


}
