package OOPsBasics;

import java.util.Scanner;

class Test5 {
    double balance;
    String accountType;

    // 'this' keyword is used to refer to the current object of the class.

    // a constructor can be used to set default values and values passed as
    // arguments both.
    public Test5(double balance) {
        this.balance = balance; // given by user
        accountType = "Savings"; // default value
    }

    public void print() {
        System.out.println("The Balance is: " + balance);
        System.out.println("Account Type is: " + accountType);
    }

}

// In a class, we can have multiple constructors with different parameters.
// In that case, the constructor matching the arguments with parameters is
// called.
class Test6 {
    double balance;
    String accountType;

    public Test6(double balance) // constructor with 1 parameter.
    {
        this.balance = balance; // value passed by user.
        this.accountType = "Savings"; // default value
    }

    public Test6(double balance, String accountType) // constructor with 2 parameter.
    {
        this.balance = balance; // value passed by user.
        this.accountType = accountType; // value passed by user.
    }

    public void print() {
        System.out.println("The Balance is: " + balance);
        System.out.println("The Account Type is: " + accountType);
    }
}

public class moreOnConstructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String str = sc.nextLine();
        Test5 test5 = new Test5(num);
        test5.print();

        Test6 testing = new Test6(num); // constructor with 1 parameter called.
        testing.print();
        Test6 testing2 = new Test6(num, str); // constructor with 2 parameters called.
        testing2.print();
        sc.close();
    }
}
