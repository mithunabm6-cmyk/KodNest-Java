
import java.util.Scanner;

class first1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
