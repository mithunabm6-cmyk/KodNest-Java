
import java.util.Scanner;

class COPYARR {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int copy[] = new int[arr.length];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Step 4: Print copied array 
        System.out.println("\nCopied array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

    }
}
