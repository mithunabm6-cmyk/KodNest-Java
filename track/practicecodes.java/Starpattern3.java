
import java.util.Scanner;

class Starpattern3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
