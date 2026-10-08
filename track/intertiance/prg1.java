
public class parent {

    void display1() {
        System.out.println("inside parent display1");
    }

    void display2() {
        System.out.println("inside parent display2");
    }
}

public class child extends parent {

    @Override
    void display2() {
        System.out.println("inside child display2");
    }

    void display3() {
        System.out.println("inside child display3");
    }
}

public class prg1 {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.display1();
        c1.display2();
        c1.display3();
    }
}
