
import java.util.Scanner;

class array1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array size:");
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        scan.close();

    }

}
