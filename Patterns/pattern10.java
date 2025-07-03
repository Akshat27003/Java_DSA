package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
 */

class Solution10 {
    private void codePatternUpperHalve(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void codePatternLowerHalve(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void codePattern10(int num) {
        codePatternUpperHalve(num);
        codePatternLowerHalve(num - 1);
    }
}

public class pattern10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution10 solution = new Solution10();
        solution.codePattern10(n);
        sc.close();

    }
}
