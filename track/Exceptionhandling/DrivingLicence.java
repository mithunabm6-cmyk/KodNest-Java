
import java.util.Scanner;

class DrivingLicence {

    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else if (age > 65) {
            throw new OverAgeException();

        } else {
            System.out.println("Driving icence will be issued");
        }
    }
}
