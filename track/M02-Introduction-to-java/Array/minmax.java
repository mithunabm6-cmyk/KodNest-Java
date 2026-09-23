
import java.util.Scanner;

class minmax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minimum = scanner.nextInt();
        int maximum = minimum;
        for (int i = 1; i < n; i++) {
            int value = scanner.nextInt();
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
        }
        System.out.println(minimum + " " + maximum);
        scanner.close();
    }
}
