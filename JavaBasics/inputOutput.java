package JavaBasics;

import java.util.Scanner;

public class inputOutput {

    // take an integer as input from user and print it.

    public static void main(String[] args) { // main method

        Scanner sc = new Scanner(System.in); // object of Scanner class

        System.out.println("Enter a number: ");
        int n = sc.nextInt(); // take input in var n of int type
        System.out.println("The entered number is: " + n); // printing the value of n.

        sc.close();
    }

}
