package za.ac.cput.factory;

import za.ac.cput.entity.WorkOut;

public class WorkOutFactory {

    public static WorkOut createWorkOut(int workoutId, String workoutName, String workoutDescription){
        return  new WorkOut.Builder().setWorkoutId(workoutId).setWorkoutName(workoutName)
                .setWorkoutDescription(workoutDescription).build();
    }
}
