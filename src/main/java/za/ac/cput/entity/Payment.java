package za.ac.cput.entity;

/* Payment.java
Entity for the payment
Author: Bongisa Mpahleni (216205999)
Date: 09 June 2021
*/


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {

    @Id
    private int paymentID;
    private double paymentAmount;
    private String paymentDate;

    public Payment() {}

    public Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.paymentAmount = builder.paymentAmount;
        this.paymentDate = builder.paymentDate;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public double getPaymentAmount(){
        return paymentAmount;
    }

    public String getPaymentDate(){
        return paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", paymentAmount=" + paymentAmount +
                ", paymentDate=" + paymentDate +
                '}';
    }

    public static class Builder
    {


        private  int paymentID;
        private  double paymentAmount;
        private String paymentDate;


        //Set paymentID
        public Builder setPaymentID(int paymentID)
        {
            this.paymentID= paymentID;
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
            this.paymentAmount=payment.paymentAmount;
            this.paymentDate=payment.paymentDate;


            return this;
        }

    }




}
