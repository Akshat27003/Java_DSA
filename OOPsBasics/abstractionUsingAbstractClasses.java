package OOPsBasics;

// Abstraction: Hiding implementation. Showing essential features.
// We can't create object of abstract classes.

abstract class BankAcct {
    double balance;

    void updateBalance(double balance) // non abstract method.
    {
        this.balance = balance;
    }

    double getBalance() // non abstract method.
    {
        return balance;
    }

    abstract void addMoney(double amount); // abstract method.

    abstract void canUserWithdrawMoney(double amount); // abstract method.
}

// non abstracting class inheriting abstract class.
class SavingsAccount extends BankAcct {
    public void addMoney(double amount) // implementing abstract method in derived class.
    {
        super.updateBalance(super.getBalance() + amount);
        // super.getBalance() fetches the current balance.
        // amount is added to current Balance.
        // super.updateBalance() to modify the old balance with new balance.
        // super is used to access the non abstract methods of base abstract class.
    }

    public void canUserWithdrawMoney(double amount) // implementing abstract method in derived class.
    {
        if (amount <= super.getBalance()) {
            System.out.println("Withdrawal Possible"); // if withdrawal amount is less than current balance.
        } else {
            System.out.println("Withdrawal Not Possible");
        }
    }

}

// non abstracting class inheriting abstract class again.
class CurrentAccount extends BankAcct {
    double minLimit = 1000.0;

    public void addMoney(double amount) // implementing abstract method in derived class.
    {
        super.updateBalance(super.getBalance() + amount);
        // super.getBalance() fetches the current balance.
        // amount is added to current Balance.
        // super.updateBalance() to modify the old balance with new balance.
        // super is used to access the non abstract methods of base abstract class.
    }

    // different implementation from previous class implementation of
    // canUserWithdrawMoney().
    public void canUserWithdrawMoney(double amount) // implementing abstract method in derived class.
    {
        if (super.getBalance() - amount >= minLimit) // making sure after withdrawal, minimum 1000.0 is there in acct.
        {
            System.out.println("Withdrawal Possible"); // if withdrawal amount is less than current balance.
        } else {
            System.out.println("Withdrawal Not Possible");
        }
    }

}

public class abstractionUsingAbstractClasses {
    public static void main(String[] args) {
        BankAcct acct = new SavingsAccount();
        // Accessing non abstract method of abstract class
        // using object of derived class.
        // Reference variable of BankAcct abstract class type.
        acct.updateBalance(1500.0);
        System.out.println("The balance in Acct is: " + acct.getBalance());

        acct.addMoney(1500.0); // accessing abstract method using object of derived class.
        // implementation in derived class itself.
        System.out.println("The balance in Acct is: " + acct.getBalance());
        acct.canUserWithdrawMoney(1500.0); // accessing abstract using object of derived class.
        acct.canUserWithdrawMoney(3500.0);
        // here minimum Limit is not there.
        // if 2500.0 is added and balance initially was 0,
        // max withdrawal possible is 2500.0 from SavingsAccount.

        BankAcct acct2 = new CurrentAccount();
        // accessing abstract method using object of derived class.
        // implementation in derived class itself.
        // Reference variable of BankAcct abstract class type.
        acct2.addMoney(2500.0);
        System.out.println("The balance in Acct is: " + acct2.getBalance());
        acct2.canUserWithdrawMoney(1000.0);
        acct2.canUserWithdrawMoney(2000.0);
        // here min Limit is 1000.0.
        // if 2500.0 is added and balance initially was 0,
        // max withdrawal possible is 1500.0 from CurrentAccount.
    }
}
