public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println();
        System.out.println("Gym members information");
        StudentMember student = new StudentMember("Alikhan", "asd001", "2025-01-10", "20% Student Discount");
        PremiumMember premium = new PremiumMember("Elon", "atw001", "2024-06-15", 2500);
        SeniorMember senior = new SeniorMember("Albert", "qwe001", "2023-03-20", 68);
        student.displayInfo();
        student.showDiscount();
        System.out.println();
        premium.displayInfo();
        premium.redeemPoints();
        senior.displayInfo();
        senior.specialAssistance();
        System.out.println("Workout plan");
        Workout[] workouts = new Workout[3];
        workouts[0] = new CardioWorkout("Morning Run", "30 minutes", "running");
        workouts[1] = new StrengthWorkout("Upper Body Strength", "45 minutes", "chest and back");
        workouts[2] = new YogaWorkout("Evening Relaxation", "40 minutes", "intermediate");
        for (Workout w : workouts) {
            w.showWorkout();
        }
        System.out.println("Trainers");
        PersonalTrainer personal = new PersonalTrainer("Anna Smith", 7, "weight loss & toning", 6);
        GroupTrainer group = new GroupTrainer("Mike Tyson", 10, "HIIT & bootcamp", 20);
        personal.introduce();
        personal.conductSession();
        personal.displayMaxClients();
        System.out.println();
        group.introduce();
        group.conductSession();
        group.motivateGroup();
    }
}
