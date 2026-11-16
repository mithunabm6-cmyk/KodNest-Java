
import java.util.Scanner;

class GIVENNUM {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        System.out.println("enter a number");
        int search = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > search) {
                count++;
            }
        }
        System.out.println("Count " + count);
    }
}
