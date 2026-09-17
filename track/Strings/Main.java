
class Car {

    static void convertKmIntoMiles() {
        System.out.println("converting KM into miles");
    }

    void calcualteMilage() {
        System.out.println("calculating milage");
    }
}

public class Main {

    public static void main(String[] args) {
        {
            Car.convertKmIntoMiles();
            Car nano = new Car();
            nano.calculateMilage();
            Car bmw = new Car();
            bmw.calulateMilage();
        }
    }
}
