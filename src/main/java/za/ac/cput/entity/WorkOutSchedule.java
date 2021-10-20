package za.ac.cput.entity;
/* Hlumelo Mpotulo
   215226348
   workout schedule entity

 */

import org.springframework.http.HttpHeaders;
import za.ac.cput.repository.impl.WorkOutScheduleRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WorkOutSchedule")


public class WorkOutSchedule {
    @Id
    private int scheduleId;
    private int trainerId;
    private int memberId;
    private int workoutId;
    private String workoutDate;
    private String workoutTime;


    public WorkOutSchedule(WorkOutSchedule.Builder builder) {
        this.scheduleId = builder.scheduleId;
        this.trainerId = builder.trainerId;
        this.memberId = builder.memberId;
        this.workoutId = builder.workoutId;
        this.workoutDate = builder.workoutDate;
        this.workoutTime = builder.workoutTime;
    }

    public WorkOutSchedule() {

    }

    public static class Builder {
        private int scheduleId;
        private int trainerId;
        private int memberId;
        private int workoutId;
        private String workoutDate;
        private String workoutTime;

        public Builder(WorkOutSchedule workOutSchedule) {
        }

        public WorkOutSchedule.Builder setScheduleId(int scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        public WorkOutSchedule.Builder setTrainerId(int trainerId) {
            this.trainerId = trainerId;
            return this;
        }

        public WorkOutSchedule.Builder setMemberId(int memberId) {
            this.memberId = memberId;
            return this;
        }

        public WorkOutSchedule.Builder setWorkoutId(int workoutId) {
            this.workoutId = workoutId;
            return this;
        }

        public WorkOutSchedule.Builder setWorkoutDate(String workoutDate) {
            this.workoutDate = workoutDate;
            return this;
        }

        public WorkOutSchedule.Builder setWorkoutTime(String workoutTime) {
            this.workoutTime = workoutTime;
            return this;
        }

        public WorkOutSchedule build() {
            return new WorkOutSchedule(this);
        }



    }

    public int getWorkoutId() {
        return this.workoutId;
    }

    public static int getScheduleId() {
        int scheduleId1 = getScheduleId();
        return scheduleId1;
    }

    public int getTrainerId() {
        return this.trainerId;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public String getWorkoutDate() {
        return this.workoutDate;
    }

    public String getWorkoutTime() {
        return this.workoutTime;
    }

    @Override
    public String toString() {
        String data = "";
        data += "{WorkoutId: " + workoutId + ",";
        data += "{scheduleId: " + scheduleId + ",";
        data += "{trainerId: " + trainerId + ",";
        data += "{memberId: " + memberId + ",";
        data += "{workoutDate: " + workoutDate + ",";
        data += "{workoutTime: " + workoutTime + ",";
        return data;
    }
}
