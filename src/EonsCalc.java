public class EonsCalc {
    public static void main(String[] args) {
        long ageOfUniverse = Long.valueOf(args[0]);
        long yearsSinceDinosaurs = Long.valueOf(args[1]);

        System.out.println ("The universe was " + (ageOfUniverse - yearsSinceDinosaurs) + " years old when the dinosaurs went extinct.");


    }
}
