
import java.util.Scanner;

class ROWCOLUMN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scan.nextInt();

        System.out.println("Enter number of columns:");
        int cols = scan.nextInt();

        int a[][] = new int[rows][cols];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("array elements are:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
