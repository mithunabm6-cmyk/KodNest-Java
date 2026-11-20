
class Printer   

    implements Runnable {

        @Override
        synchronized public void run() {
            try {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "started using printer");
                Thread.sleep(3000);
                System.out.println(threadName + "using printer");
                Thread.sleep(3000);
                System.out.println(threadName + "stopped using printer");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    c
    public static void main(String[] args) {
        Printer pr = new Printer();
        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(pr);
        Thread t3 = new Thread(pr);

        t1.setName("Java develper");
        t2.setName("python developer");
        t3.setName("c developer");

        t1.start();
        t2.start();
        t3.start();

    }
}
