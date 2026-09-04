
import java.util.Scanner;

class LearnerProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();
        int solvedProblems = scanner.nextInt();
        double assementPercentage = scanner.nextDouble();
        System.out.println("Learner: " + firstname);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("AssementPercenatage: " + assementPercentage);

    }
}
