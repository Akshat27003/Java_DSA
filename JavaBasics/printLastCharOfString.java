package JavaBasics;

import java.util.Scanner;

public class printLastCharOfString {

    public static void main(String[] args) {

        // given a string str, print the last char of the string str.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // using charAt() and str.length() to print the last char of string.
        // blank space is also a valid char.
        char lastChar = str.charAt(str.length() - 1);
        System.err.println("The last char of the given string is: " + lastChar);

        sc.close();
    }
}
