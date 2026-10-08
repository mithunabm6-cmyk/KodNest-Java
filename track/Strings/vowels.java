
import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowelCount = 0;

        for (int index = 0; index < text.length(); index++) {
            char current = Character.toLowerCase(text.charAt(index));

            if (current == 'a' || current == 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Characters: " + text.length());
        System.out.println("Vowels: " + vowelCount);
    }
}
