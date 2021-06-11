package za.ac.cput.Entity;
import java.lang.constant.Constable;
import java.util.Date;

/* Payment.java
Entity for the payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/



public class Payment {

private  int paymentID;
private  int memberID;
private  double paymentAmount;
private String paymentDate;

    public Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        memberID = builder.memberID;
        this.paymentAmount = builder.paymentAmount;
        this.paymentDate = builder.paymentDate;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public int getMemberID() {
        return memberID;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", MemberID=" + memberID +
                ", paymentAmount=" + paymentAmount +
                ", paymentDate=" + paymentDate +
                '}';
    }

    public static class Builder
    {


        private  int paymentID;
        private  int memberID;
        private  double paymentAmount;
        private String paymentDate;


        //Set paymentID
        public Builder setPaymentID(int paymentID)
        {
            this.paymentID= paymentID;
            return this;
        }
        //Set MemberID
        public Builder setMemberID(int memberID)
        {
            this.memberID= memberID;
            return this;
        }

        //Set PaymentAmount
        public Builder setPaymentAmount(double paymentAmount)
        {
            this.paymentAmount= paymentAmount;
            return this;
        }

        //Set paymentDAte
        public Builder setpayMentDate(String paymentDate)
        {
            this.paymentDate= paymentDate;
            return this;
        }



        public Payment build()
        {
            return new Payment(this);
        }

        //Copy method
        public Builder copy(Payment payment)
        {

            this.paymentID= payment.paymentID;
            this.memberID=payment.memberID;
            this.paymentAmount=payment.paymentAmount;
            this.paymentDate=payment.paymentDate;


            return this;
        }

    }




}
