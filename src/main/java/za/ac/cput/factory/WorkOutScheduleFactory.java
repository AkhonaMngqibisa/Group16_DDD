package za.ac.cput.factory;

import za.ac.cput.entity.WorkOutSchedule;

public class WorkOutScheduleFactory {

    public static WorkOutSchedule createWorkOutSchedule(int scheduleId, int trainerId, int memberId,
                                                        int workoutId, String workoutDate, String workoutTime){
        return new WorkOutSchedule.Builder().setScheduleId(scheduleId).setTrainerId(trainerId)
                .setMemberId(memberId).setWorkoutId(workoutId).setWorkoutDate(workoutDate)
                .setWorkoutTime(workoutTime).build();
    }
}
