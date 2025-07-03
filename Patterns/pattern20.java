package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    *      *
    **    **
    ***  ***
    ********
    ***  ***
    **    **
    *      *
 */

class Solution20 {

    private void codeUpperHalvePattern(int num) {
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

    private void codeLowerHalvePattern(int num) {

        for (int i = 0; i < num; i++) {
            // stars
            for (int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }

            // spaces
            for (int spaces = 0; spaces <= ((2 * i) + 1); spaces++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void codePattern20(int num) {
        codeUpperHalvePattern(num);
        codeLowerHalvePattern(num - 1);
    }
}

public class pattern20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution20 solution = new Solution20();
        solution.codePattern20(n);
        sc.close();
    }
}