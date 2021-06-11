
package za.ac.cput.Entity;
/* Hlumelo Mpotulo
=======
package za.ac.cput.Entity;
/* Hlumelo Mpotulo
>>>>>>> 92e98cde8e45578292d2855f9b9f59352e5f7d56:src/main/java/WorkOut.java
   215226348

 */

public class WorkOut {
    private int workoutId;
    private String workoutName;
    private String workoutDescription;

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
        public WorkOut build(){
            return new WorkOut(this);

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
}
