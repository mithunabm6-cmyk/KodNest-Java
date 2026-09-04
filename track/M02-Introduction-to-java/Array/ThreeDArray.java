
import java.util.Scanner;

class ThreeDArray {

    public static void main(String[] args) {
        int a[][][] = new int[3][3][5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array Elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                for (int k = 0; k <= a[i][j].length - 1; k++) {
                    System.out.println(a[i][j][k] + " ");

                }
                System.out.println();

            }
            System.out.println();
        }
    }
}
