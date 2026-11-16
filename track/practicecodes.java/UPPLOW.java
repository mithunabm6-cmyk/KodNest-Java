
import java.util.Scanner;

class UPPLOW {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = scan.nextInt();
        //outer loop runs 9 times//
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
