
import java.util.Scanner;

class Heart {

    private String type;

    Heart(String type) {
        this.type = type;
    }

    void pump(String personName) {
        System.out.println(type + " heart beats for " + personName);
    }
}

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    void live(Heart heart) {
        heart.pump(name);
    }
}

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personName = scanner.nextLine();
        String heartType = scanner.nextLine();

        Person person = new Person(personName);
        Heart heart = new Heart(heartType);
        person.live(heart);
    }
}
