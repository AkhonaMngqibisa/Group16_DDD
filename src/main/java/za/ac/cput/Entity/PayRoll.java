package za.ac.cput.Entity;
/* Payroll.java
Entity for the Payroll.
Author: Bokang Molaoa (218131097) ADP3 Assignment 3.
Date: 09 June 2021
*/

public class PayRoll {
    private String payrollID;
    private String trainerID;
    private String hours;
private PayRoll (Builder builder)
{
    this.payrollID=builder.payrollID;
    this.trainerID=builder.trainerID;
    this.hours=builder.hours;
}

    public String getPayrollID() {
        return payrollID;
    }

    public String getTrainerID() {
        return trainerID;
    }

    public String getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "PayRoll{" +
                "payrollID=" + payrollID +
                ", trainerID=" + trainerID +
                ", hours=" + hours +
                '}';
    }

    public static class Builder {
        private String payrollID;
        private String trainerID;
        private String hours;

        public Builder setPayrollID(String payrollID) {
            this.payrollID = payrollID;
            return this;
        }

        public Builder setTrainerID(String trainerID) {
            this.trainerID = trainerID;
            return this;
        }

        public Builder setHours(String hours) {
            this.hours = hours;
            return this;
        }

        //Return instance of PayRoll.
        public PayRoll build() {
           return new PayRoll(this);
        }

        //Copy method
        public Builder copy(PayRoll payRoll) {
            return this;
        }

    }

}
