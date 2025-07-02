package OOPsBasics;

// encapsulation is the process of bundling data in a single unit (class), and denying outside access to it.

class BankAccount {
    private double balance; // encapsulation.

    public BankAccount(double balance) // parameterized constructor.
    {
        this.balance = balance;
    }

    public void setBalance(double balance) // setter method.
    {
        this.balance = balance;
    }

    public double getBalance() // getter method.
    {
        return balance;
    }
}

public class encapsulationExample {

    public static void main(String[] args) {
        BankAccount acct = new BankAccount(200.0); // parameterized constructor invoked.
        System.out.println(acct.getBalance()); // getter method used to fetch balance.
        acct.setBalance(20000.0); // setter method used to access balance.
        System.out.println(acct.getBalance()); // getter method used to fetch balance again.
    }

}
