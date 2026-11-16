
import java.util.Scanner;

class LastIndex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int search = 50;
        int LastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                LastIndex = i;
            }
        }
        System.out.println("Last index: " + LastIndex);
    }
}
