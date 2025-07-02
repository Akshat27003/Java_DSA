package JavaBasics;

import java.util.Scanner;

public class doWhileLoopUseCase {

    // Problem:
    // Print all numbers input by user till a negative number is entered.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        // implementing do while loop
        do {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println(num);
            } else {
                System.out.println("Negative Number Entered!");
            }
        } while (num >= 0);

        sc.close();
    }

}
