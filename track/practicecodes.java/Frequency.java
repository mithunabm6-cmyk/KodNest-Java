
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter  elements:");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the target value to find:");
        int target = scan.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);

        scan.close();
    }
}
