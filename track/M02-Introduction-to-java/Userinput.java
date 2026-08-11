
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter byte value: ");
        byte a = scan.nextByte();
        System.out.println("byte values is :" + a);

        System.out.println("enter short value: ");
        short b = scan.nextShort();
        System.out.println("short values is :" + b);

        System.out.println("enter short value: ");
        short c = scan.nextShort();
        System.out.println("short values is:" + c);

        System.out.println("enter integer value: ");
        int d = scan.nextInt();
        System.out.println("integer values is:" + d);

        System.out.println("enter float value: ");
        float e = scan.nextFloat();
        System.out.println("float values is:" + e);

        System.out.println("enter boolean value: ");
        boolean f = scan.nextBoolean();
        System.out.println("boolean values is:" + f);

    }
}
