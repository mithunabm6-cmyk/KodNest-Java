
import java.util.Scanner;

class Twopointer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = arr[left];
            left++;
            right--;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
