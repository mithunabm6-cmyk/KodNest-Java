
public class Main {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("World");

        s.append("Hello");
        s.insert(0, "java");
        s.delete(5, 11);

        System.out.println(s);
    }
}
