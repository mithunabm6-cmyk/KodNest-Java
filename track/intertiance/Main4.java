
class Developer {

    void work() {
        System.out.println("developing working");
    }

    void project() {
        System.out.println("developing doing project");
    }
}

public class JavaDeveloper extends Developer {

    void work() {
        System.out.println("Java developer working");
    }

    void project() {
        System.out.println("Java developer doing project");
    }
}

public class pythonDeveloper extends Developer {

    void work() {
        System.out.println("python developer working");
    }

    void project() {
        System.out.println("python developer doing project");
    }
}

public class Main4 {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);
        pythonDeveloper pd = new pythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
