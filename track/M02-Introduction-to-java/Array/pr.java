
import java.util.Scanner;

class pr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.println("");
            }
            System.out.println(arr[i]);
        }
    }
}
