
class TRYCATCH {

    public static void main(String[] args) {

        int balance = 10009;
        int withdraw = 9000;

        if (withdraw > balance) {

            throw new ArithmeticException("Insufficient Balance");

        } else {

            balance = balance - withdraw;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);

        }

        System.out.println("Thank You");
    }
}
