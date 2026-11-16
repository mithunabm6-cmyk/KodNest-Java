
import java.util.Scanner;

class thread2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a:");
        int a = scan.nextInt();
        System.out.println("enter first number");
        int n1 = scan.nextInt();
        System.out.println("enter second number");
        int n2 = scan.nextInt();
        int res = n1 + n2;
        System.out.println("addtion result is: " + res);
    }
}
