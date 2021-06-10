package za.ac.cput.Entity;
/* Payroll.java
Entity for the Payroll.
Author: Bokang Molaoa (218131097)
Date: 09 June 2021
*/

public class PayRoll {
    private int payrollID, trainerID, hours;
private PayRoll (Builder builder)
{
    this.payrollID=builder.payrollID;
    this.trainerID=builder.trainerID;
    this.hours=builder.hours;
}

    public int getPayrollID() {
        return payrollID;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public int getHours() {
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
        private int payrollID, trainerID, hours;

        public Builder setPayrollID(int payrollID) {
            this.payrollID = payrollID;
            return this;
        }

        public Builder setTrainerID(int trainerID) {
            this.trainerID = trainerID;
            return this;
        }

        public Builder setHours(int hours) {
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
