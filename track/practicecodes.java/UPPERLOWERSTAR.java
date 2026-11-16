
import java.util.Scanner;

class UPPERLOWERSTAR {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = scan.nextInt();
        // upper half * prints//
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half * prints//
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
