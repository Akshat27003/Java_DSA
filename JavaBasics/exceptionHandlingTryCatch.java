package JavaBasics;

import java.util.Scanner;

public class exceptionHandlingTryCatch {

    // handle the case of division by 0 using exception handling (try catch).
    // also use syntax of "finally"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // implementing try catch
        try {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            int num3 = num1 / num2;
            System.err.println("First number divided by second number is: " + num3);
        } catch (Exception e) {
            System.out.println(e);
        }

        // using finally
        finally {
            System.out.println("Code is done!");
        }
        sc.close();
    }
}
