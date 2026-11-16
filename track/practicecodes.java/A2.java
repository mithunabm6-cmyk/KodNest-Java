
import java.util.Scanner;

class A2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
