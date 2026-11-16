
class PROGRAM2 {

    public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 8000;

        if (withdraw > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }

        System.out.println("Transaction Completed");
        System.out.println("Thank You");
    }
}
