package OOPsBasics;

import java.util.Scanner;

class Test2 {
    public void print() {
        System.err.println("Default constructor internally is called.");
        System.out.println("Test2 Class accessed.");
    }
}

class Test3 {
    int age;
    String name;

    public Test3() // default constructly explicitly specified by us.
    {
        System.out.println("Default constructor specified by us is invoked!");
        age = 18; // setting default values using constructor.
        name = "Default"; // setting default values using constructor.
    }

    public void printt() {
        System.out.println("Test3 Class accessed.");
    }
}

class Test4 {
    double num;

    public Test4(double _num) // parameterized constructor defined here.
    {
        num = _num;
    }

    public void printNum() {
        System.out.println("The entered number is: " + num);
    }
}

public class understandingConstructors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner is needed only to set parameterized constructor value.
        Test2 test2 = new Test2(); // default constructor hidden to us is called. It works internally.
        test2.print();
        // To check and see that the default constructor is called, we can modify it.
        // lets modify default constructor call for Test3.
        Test3 test3 = new Test3(); // object of Test3 is created. constructor call takes place.
        // above line will print what we have specified in the constructor creation.
        test3.printt();
        // we can use default constructors to assign default values to variables.
        System.out.println("Age is: " + test3.age);
        System.out.println("Name is: " + test3.name);
        // We can pass parameters to constructors.
        // They called parameterized constructor.
        // Using parameterized constructors, we can assign user given values to
        // variables.
        int num = sc.nextInt();
        Test4 test4 = new Test4(num);
        test4.printNum(); // prints num given by user.
        sc.close();
    }
}
