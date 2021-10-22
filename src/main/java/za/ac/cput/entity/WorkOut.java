
package za.ac.cput.entity;
/* Hlumelo Mpotulo
   215226348
   workout entity

 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WorkOut
{

    @Id
    private int workoutId;
    private String workoutName;
    private String workoutDescription;

    public WorkOut() {}

    private WorkOut(Builder builder) {
        this.workoutId = builder.workoutId;
        this.workoutName = builder.workoutName;
        this.workoutDescription = builder.workoutDescription;
    }

    public static class Builder {
        private int workoutId;
        private String workoutName;
        private String workoutDescription;

        public Builder setWorkoutId(int workoutId) {
            this.workoutId = workoutId;
            return this;
        }

        public Builder setWorkoutName(String workoutName) {
            this.workoutName = workoutName;
            return this;
        }

        public Builder setWorkoutDescription(String workoutName) {
            this.workoutName = workoutName;
            return this;
        }
        public WorkOut build() {
            return new WorkOut(this);

        }

    }

    public int getWorkoutId(){
        return this.workoutId;
    }
    public String getWorkoutName(){
        return this.workoutName;
    }
    public String getWorkoutDescription(){
        return this.workoutDescription;
    }
    @Override
    public String toString(){
        String data = "";
        data += "{WorkoutId: "+workoutId+",";
        data += "{WorkoutName: "+workoutName+",";
        data += "{WorkoutDescription: "+workoutDescription+",";
        return data;
    }
}
