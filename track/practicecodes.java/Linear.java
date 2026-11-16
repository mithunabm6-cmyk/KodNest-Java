
import java.util.Scanner;

class Linear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int search = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }
}
