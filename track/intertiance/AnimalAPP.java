
public class Monkey extends Animal {

    void eat() {
        System.out.println("monkey steals and eats");
    }
}

public class Tiger extends Animal {

    void eat() {
        System.out.println("tiger hunts and eats");
    }
}

public class AnimalApp {

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        Tiger t = new Tiger();
        t.eat();
    }
}
