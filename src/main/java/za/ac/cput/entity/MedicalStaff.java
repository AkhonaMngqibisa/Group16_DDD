/* MedicalStaff.java
 * MedicalStaff entity for the gym system
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 09 June 2021
 */

package za.ac.cput.entity;

public class MedicalStaff {

    public static class Builder {
        private int mediStaffID;
        private String mediStaffFirstName;
        private String mediStaffLastName;
        private String phoneNumber;
        private String email;

        public Builder(MedicalStaff ms) {
            this.mediStaffID = ms.id;
            this.mediStaffFirstName = ms.firstName;
            this.mediStaffLastName = ms.lastName;
            this.phoneNumber = ms.phoneNumber;
            this.email = ms.email;
        }

        public Builder(int mediStaffID) {
            this.mediStaffID = mediStaffID;
        }

        public Builder setFirstName(String firstName)
        {
            mediStaffFirstName = firstName;

            return this;
        }

        public Builder setLastName(String lastName)
        {
            mediStaffLastName = lastName;

            return this;
        }

        public Builder setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;

            return this;
        }

        public Builder setEmail(String email)
        {
            this.email = email;

            return this;
        }

        public MedicalStaff build()
        {
            MedicalStaff ms = new MedicalStaff();
            ms.id = this.mediStaffID;
            ms.firstName = this.mediStaffFirstName;
            ms.lastName = this.mediStaffLastName;
            ms.phoneNumber = this.phoneNumber;
            ms.email = this.email;
            ms.checkupsDone = 0;
            ms.fitnessTestsDone = 0;
            ms.medicalEmergenciesDone = 0;
            return ms;
        }
    }

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private int checkupsDone;
    private int fitnessTestsDone;
    private int medicalEmergenciesDone;

    public MedicalStaff() {}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCheckupsDone() {
        return checkupsDone;
    }

    public int getFitnessTestsDone() {
        return fitnessTestsDone;
    }

    public int getMedicalEmergenciesDone() {
        return medicalEmergenciesDone;
    }

    public String checkup(Member member, double heartRate, double BMI, String comment)
    {
        double BMILow = 18.5;
        double BMIHigh = 24.9;
        double HRLow = 60;
        double HRHigh = 100;
        String recommendedExercises = "";
        String recommendedDiet = "";

        checkupsDone += 1;

        if(
            BMILow <= BMI &&
            BMI <= BMIHigh &&
            HRLow <= heartRate &&
            heartRate <= HRHigh
        )
            return String.format("%S is healthy.", member.getFirstName());

        if(BMI < BMILow) {
            recommendedExercises += stringList(recommendedExercises, "push-ups, pull-ups, squats, lunges");
            recommendedDiet += stringList(recommendedDiet, "eggs, nuts, red meat, full-fat dairy");
        } else if(BMI > BMIHigh) {
            recommendedExercises += stringList(recommendedExercises, "walking, biking, swimming");
            recommendedDiet += stringList(recommendedDiet, "fruits, vegetables, high fibre meals");
        }

        if(heartRate < HRLow)
        {
            recommendedExercises += stringList(recommendedExercises, "tennis, jumping rope");
            recommendedDiet += stringList(recommendedDiet, "fish, grains, legumes, vitamin A");
        } else if(heartRate > HRHigh)
        {
            recommendedExercises += stringList(recommendedExercises, "meditation, yoga, stretches");
            recommendedDiet += stringList(recommendedDiet, "water, reduce caffeine intake, reduce alcohol intake");
        }
        return String.format("Recommendations for %S %S:\nExercise: %s\nDiet: %s", member.getFirstName(), member.getLastName(), recommendedExercises, recommendedDiet);
    }

    public boolean fitnessTest(Member member, int pacer, double mileRun, int pushUps)
    {
        fitnessTestsDone += 1;
        return !(pacer < 54 || mileRun > 8.05 || pushUps < 18);
    }

    public String medicalEmergency(Member member, String comment)
    {
        medicalEmergenciesDone += 1;
        return String.format("MEDICAL EMERGENCY:\nMEMBER: %S %S\nDESCRIPTION: %s", member.getFirstName(), member.getLastName(), comment);
    }

    public String medicalEmergency(String comment)
    {
        medicalEmergenciesDone += 1;
        return String.format("MEDICAL EMERGENCY:\nNON-MEMBER\nDESCRIPTION: %s", comment);
    }

    public String toString()
    {
        return String.format(
                """
                        Title: Medical staff
                        Name: %s %s
                        Phone Number: %s
                        Email: %s
                        """,
            firstName, lastName, phoneNumber, email
        );
    }

    private String stringList(String s1, String s2) {
        if(s1.equals("")) return s2;
        return s1 + ", " +s2;
    }
}
