
import java.util.Scanner;

class PersonalExpense {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        double Rent = scanner.nextDouble();
        double Food = scanner.nextDouble();
        double Travel = scanner.nextDouble();
        double totalexpense = Rent + Food + Travel;
        double remaining = income - totalexpense;
        if (remaining >= 0) {
            System.out.println("within budget");
        } else {
            System.out.println("over budget");
        }

    }
}
