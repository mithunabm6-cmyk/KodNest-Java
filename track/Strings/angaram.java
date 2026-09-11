
import java.util.*;

class angaram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string1 and string2");
        String s1 = scanner.next();
        String s2 = scanner.next();
        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);
        if (sortedStr1.equals(sortedStr2)) {
            System.out.println("strings are anagram");
        } else {
            System.out.println("string are not anagram");
        }

    }
}
