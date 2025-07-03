package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    ********
    ***  ***
    **    **
    *      *
    *      *
    **    **
    ***  ***
    ********
 */
class Solution19 {

    private void codeUpperHalvePattern(int num) {
        for (int i = 0; i < num; i++) {
            // stars
            for (int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }

            // spaces
            for (int spaces = 0; spaces < (2 * i); spaces++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void codeLowerHalvePattern(int num) {
        for (int i = 0; i < num; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int spaces = 0; spaces < (2 * (num - i - 1)); spaces++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void codePattern19(int num) {
        codeUpperHalvePattern(num);
        codeLowerHalvePattern(num);
    }
}

public class pattern19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution19 solution = new Solution19();
        solution.codePattern19(n);
        sc.close();
    }
}
