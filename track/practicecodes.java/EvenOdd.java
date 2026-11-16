
import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
