package Patterns;

import java.util.Scanner;
import java.lang.Math;

/*
    for n=4, print:
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4
 */

class Solution22 {
    public void codePattern22(int num) {
        for (int i = 0; i < ((2 * num) - 1); i++) {
            for (int j = 0; j < ((2 * num) - 1); j++) {
                int top = i;
                int bottom = (2 * num) - 2 - i;
                int left = j;
                int right = (2 * num) - 2 - j;

                int minVal = Math.min(Math.min(top, bottom), Math.min(left, right));
                // min method, Math class, lang package.
                // min method is static.
                System.out.print(num - minVal + " ");
            }
            System.out.println();
        }
    }
}

public class pattern22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution22 solution = new Solution22();
        solution.codePattern22(n);
        sc.close();
    }
}
