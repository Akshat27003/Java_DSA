package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
       A
      ABA
     ABCBA
    ABCDCBA
 */

class Solution17 {
    public void codePattern17(int num) {
        for (int i = 0; i < num; i++) {
            // loop for spaces
            for (int spaces = 0; spaces < (num - i - 1); spaces++) {
                System.out.print(" ");
            }

            // loop for characters
            char ch = 'A';
            for (int j = 0; j < ((2 * i) + 1); j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}

public class pattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution17 solution = new Solution17();
        solution.codePattern17(n);
        sc.close();
    }
}
