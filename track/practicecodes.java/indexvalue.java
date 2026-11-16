
import java.util.Scanner;

class indexvalue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter search value:");
        int search = scan.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index:" + index);
        } else {
            System.out.println("Element not found");

        }

    }
}
