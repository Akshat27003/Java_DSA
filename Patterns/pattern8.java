package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    *******
     *****
      ***
       *
 */

class Solution8 {
    public void codePattern8(int num) {
        for (int i = 0; i < num; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < ((2 * num) - (2 * i) - 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution8 solution = new Solution8();
        solution.codePattern8(n);
        sc.close();

    }
}
