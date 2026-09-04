
import java.util.Scanner;

class Program8 {

    public static void main(String[] args) {
        int a[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array Elements :");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; i++) {
                a[i][j] = scan.nextInt();
            }

        }
        System.out.println("Array Elements are:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[i][j] + " ");
            }

        }

        System.out.println();
    }

}
