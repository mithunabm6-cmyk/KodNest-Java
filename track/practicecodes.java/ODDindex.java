
import java.util.Scanner;

class ODDindex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Elements at odd indexes:");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scan.close();
    }
}
