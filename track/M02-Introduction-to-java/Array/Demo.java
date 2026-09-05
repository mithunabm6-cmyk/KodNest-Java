
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int firstIndex;
        int lastIndex;
        int largestspan = -1;
        int selectedvalue = 0;
        for (int j = 0; j < n; j++) {
            firstIndex = j;
            for (int i = 0; i < j; i++) {
                if (numbers[i] == numbers[j]) {
                    firstIndex = i;
                    break;
                }
            }
            lastIndex = j;
            for (int i = j + 1; i < n; i++) {
                if (numbers[i] == numbers[j]) {
                    lastIndex = i;
                }
            }
            int currentspan = lastIndex - firstIndex;
            if (currentspan > largestspan) {
                largestspan = currentspan;
                selectedvalue = numbers[j];
            }

        }
        System.out.println(selectedvalue + " " + largestspan);

    }
}
