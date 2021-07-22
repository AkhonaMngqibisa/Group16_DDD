package za.ac.cput.Factory;

import za.ac.cput.Entity.WorkOut;

public class WorkOutFactory {

    public static WorkOut createWorkOut(int workoutId, String workoutName, String workoutDescription){
        return  new WorkOut.Builder().setWorkoutId(workoutId).setWorkoutName(workoutName)
                .setWorkoutDescription(workoutDescription).build();
    }
}
