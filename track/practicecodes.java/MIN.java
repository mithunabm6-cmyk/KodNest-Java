
import java.util.Scanner;

class MIN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array sixe:");

        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min:" + min);

    }
}
