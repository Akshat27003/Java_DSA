package JavaBasics;

import java.util.Scanner;

public class ifElseAdultTeenProblem {

    // take age as input. print "Adult" if age >=18 and "Teen" if age < 18.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        // using if else conditional statements.
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }
        sc.close();
    }

}