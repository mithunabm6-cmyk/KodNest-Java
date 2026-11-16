
import java.util.Scanner;

class program1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondlargest);

        scan.close();
    }
}
