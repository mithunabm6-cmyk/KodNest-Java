
import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }

        balance = balance + amount;

        System.out.println("Deposit Successful");
    }

    void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();

        BankAccount account
                = new BankAccount(name, accountNumber, balance);

        int choice = sc.nextInt();
        double amount = sc.nextDouble();

        try {

            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + accountNumber);

            if (choice == 1) {

                account.deposit(amount);

            } else if (choice == 2) {

                account.withdraw(amount);

            } else if (choice == 3) {

                account.checkBalance();

            }

        } catch (InvalidAmountException e) {

            System.out.println(e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } finally {

            account.checkBalance();

            System.out.println("Transaction Completed");
        }

        sc.close();
    }
}
