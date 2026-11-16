
import java.util.Scanner;

class Reversearray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("sum " + sum);

    }

}
