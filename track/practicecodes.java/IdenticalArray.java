
import java.util.Scanner;

public class IdenticalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first array size and elements
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Read second array size and elements
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Check if lengths are different
        if (n != m) {
            System.out.println(0);
            return;
        }

        // Compare elements at every corresponding index
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println(0);
                return;
            }
        }

        // If all checks pass, arrays are identical
        System.out.println(1);

        scanner.close();
    }
}
