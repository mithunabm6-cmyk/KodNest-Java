
import java.util.Scanner;

class prgm10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = scanner.next();
        char charArr[] = str.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;
        for (int i = 0; i <= charArr.length - 1; i++) {
            revArr[j] = charArr[i];
            i--;
        }
        String revStr = new String(revArr);
        if (str.equals(revStr)) {
            System.out.println("the given string is palindrome...");
        } else {
            System.out.println("the given string is not a palindrome");
        }
    }
}
