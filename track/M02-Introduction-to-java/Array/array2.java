
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n]
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;

    }
}
