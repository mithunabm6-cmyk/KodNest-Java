
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Reverse array:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
