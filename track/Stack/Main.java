
import java.util.*;

class Main {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        System.out.println(s.size());

        s.push(10);
        s.push(20);
        s.push(90);

        System.out.println(s.size());

        System.out.println("Top: " + s.peek());

        System.out.println("Removed: " + s.pop());

        System.out.println(s.size());

        System.out.println("Is stack empty: " + s.isEmpty());
    }
}
