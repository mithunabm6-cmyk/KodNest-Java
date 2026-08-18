
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the array elements");
        for (i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }

    }
}
