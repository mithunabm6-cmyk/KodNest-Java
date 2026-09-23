
class Main2 {

    static System.out.println (

"1st static block");
        }

        static {
            System.out.println("2nd static block");
        }

        static {
            System.out.println("3rd static block");
        }

        {
            System.out.println("non static block 1");
        }

        {
            System.out.println("non static block 2");
        }

        {
            System.out.println("non static block 2");

}    
}

public class Main2 {

    public static void main(String[] args) {
        {
            Demo d1 = new Demo();
            Demo d2 = new Demo();
            Demo d3 = new Demo();

        }
    }
}
