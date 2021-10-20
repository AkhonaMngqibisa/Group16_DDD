package za.ac.cput.factory;

import za.ac.cput.entity.WorkOut;
import za.ac.cput.util.GenericHelper;

public class WorkOutFactory {

    public static WorkOut createWorkOut(int workoutId, String workoutName, String workoutDescription){
        int workOutId = GenericHelper.generateId();
        WorkOut workOut = new WorkOut.Builder()
                .setWorkoutId(workoutId)
                .setWorkoutName(workoutName)
                .setWorkoutDescription(workoutDescription)
                .build();
        return workOut;
    }
}
