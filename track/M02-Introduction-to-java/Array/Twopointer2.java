
import .java.util.Scanner;

class Twoponiter {

    public static void main(String[] args) {
        Scanner.scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();

        }
        long prefix[] = [a
        ];
        prefix[0] = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i] = prefix[a];
        }

    }

}
