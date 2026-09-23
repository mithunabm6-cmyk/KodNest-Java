
import java.util.Scanner;

public class Arrminmax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        long maxVal = Long.MIN_VALUE;
        long minVal = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long current = scanner.nextInt();
            if (current > maxVal) {
                maxVal = current;
            }
            if (current < minVal) {
                minVal = current;
            }
        }
        long difference = maxVal - minVal;
        System.out.println(difference);

        scanner.close();
    }
}
