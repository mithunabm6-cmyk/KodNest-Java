
import java.util.Scanner;

public class programarr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        long min = scanner.nextLong();
        long max = min;
        for (int i = 1; i < n; i++) {
            long num = scanner.nextLong();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println(min + " " + max);

        scanner.close();
    }
}
