
import java.util.Scanner;

public class pr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int answer = -1;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}
