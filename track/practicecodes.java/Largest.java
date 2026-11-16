
import java.util.Scanner;

class Largest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);

        scan.close();
    }
}
