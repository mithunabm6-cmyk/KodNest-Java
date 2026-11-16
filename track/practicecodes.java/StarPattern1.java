
import java.util.Scanner;

class StarPattern1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n----------------------------");
        System.out.println("welcome to star pattern printing ");
        System.out.println("-----------------------------\n");
        System.out.println("enter number of rows: ");
        int n = scan.nextInt(); // NUMBER OF ROWS PRINT BY USER//
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
