
class Parent {

    void display1() {
        System.out.println("inside parent display1");
    }

    void display2() {
        System.out.println("inside parent display2");
    }
}

class Child1 extends Parent {

    @Override
    void display2() {
        System.out.println("inside child1 display2");
    }

    void display3() {
        System.out.println("inside child1 display3");
    }
}

class Child2 extends Parent {

    @Override
    void display2() {
        System.out.println("inside child2 display2");
    }

    void display() {
        System.out.println("inside child2 display");
    }
}

public class Main5 {

    public static void main(String[] args) {

        Parent p1 = new Child1();   // Upcasting

        p1.display1();
        p1.display2();

        ((Child1) p1).display3();  // Downcasting
    }
}
