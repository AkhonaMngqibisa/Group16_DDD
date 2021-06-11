package za.ac.cput.Factory;
/* Payroll.java
Factory for the Payroll.
Author: Bokang Molaoa (218131097).
Date: 09 June 2021
*/
import za.ac.cput.Entity.PayRoll;
import za.ac.cput.Util.GenericHelper;

public class PayRollFactory {
    public static PayRoll createPayRoll (String payrollID, String trainerID, String hours) {
        int payRollID= GenericHelper.generateId();
        PayRoll payRoll= new PayRoll.Builder()
                .setPayrollID(payrollID)
                .setTrainerID(trainerID)
                .setHours(hours)
                .build();

        return payRoll;
    }
}
