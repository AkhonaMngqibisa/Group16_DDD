package za.ac.cput.factory;
/* Trainer.java
Factory for the Trainer.
Author: Bokang Molaoa (218131097).
Date: 09 June 2021
*/
import za.ac.cput.entity.Trainer;
import za.ac.cput.util.GenericHelper;

public class TrainerFactory {
    public static Trainer createTrainer (String firstName, String lastName, String phoneNo,
                                         String address, String emailAddress, String password) {

        int trainerID = GenericHelper.generateId();
        Trainer trainer = new Trainer.Builder()
                .setTrainerID(trainerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setPhoneNo(phoneNo)
                .setEmailAddress(emailAddress)
                .setPassword(password)
                .build();

        return trainer;
    }
}
