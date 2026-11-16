
import java.util.Scanner;

class Indexfound {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int index = -1;
        int search = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;

            }

        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
