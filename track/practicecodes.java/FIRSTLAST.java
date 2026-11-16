
import java.util.Scanner;

class FIRSTLAST {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
