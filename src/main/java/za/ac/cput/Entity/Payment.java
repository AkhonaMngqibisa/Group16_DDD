package za.ac.cput.Entity;
import java.util.Date;

/* Payment.java
Entity for the payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/

import java.text.DateFormat;

public class Payment {

private  int paymentID;
private  int memberID;
private  double paymentAmountID;
private Date paymentDateID;


    public Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        memberID = builder.memberID;
        this.paymentAmountID = builder.paymentAmountID;
        this.paymentDateID = builder.paymentDateID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public int getMemberID() {
        return memberID;
    }

    public double getPaymentAmountID() {
        return paymentAmountID;
    }

    public Date getPaymentDateID() {
        return paymentDateID;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", MemberID=" + memberID +
                ", paymentAmountID=" + paymentAmountID +
                ", paymentDateID=" + paymentDateID +
                '}';
    }

    public static class Builder
    {

        private  int paymentID;
        private  int memberID;
        private  double paymentAmountID;
        private Date paymentDateID;


        //Set paymentID
        public Builder setPayment(int paymentID)
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
        public Builder setPaymentAmountID(int paymentAmountID)
        {
            this.paymentAmountID= paymentAmountID;
            return this;
        }

        //Set paymentDAte
        public Builder setpayMentDate(Date paymentDateID)
        {
            this.paymentDateID= paymentDateID;
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
            this.paymentAmountID=payment.paymentAmountID;
            this.paymentDateID=payment.paymentDateID;


            return this;
        }

    }




}
