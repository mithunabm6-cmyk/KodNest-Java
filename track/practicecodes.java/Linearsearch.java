
import java.util.Scanner;

class Linearsearch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter value to search:");
        int search = scan.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }

        scan.close();
    }
}
