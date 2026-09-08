
import java.util.Scanner; // Required import statement

public class Array1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read array size
        int[] numbers = new int[n]; // Create array

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // Read array elements
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" "); // Avoids a leading or trailing space
            }
            System.out.print(numbers[i]); // Print elements
        }

        scanner.close();
    }
}
