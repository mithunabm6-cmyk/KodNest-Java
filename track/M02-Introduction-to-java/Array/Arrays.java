
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int ZeroCount = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                ZeroCount++;
            }
        }
        System.out.println(positiveCount + " " + negativeCount + " " + ZeroCount);
        scanner.close();
    }
}
