class Mobile {
    void enterpin(pin p) {
        System.out.println("PIN enter");
    }

    screen unlock() {
        Screen s = new screen();
        System.out.println("Mobile enter");
        return s;
    }
}

class pin {

}

class screen {

}

class MobileApp {
    public static void main(String[] args) 
    {
        Mobile m = new Mobile();
        Pin p = new Pin();

        m.enterpin();

        screen s = m.unlock();

        System.out.println(s);

        if(s != null) {
            System.out.println("mobile unlocked");
        }
    }
}