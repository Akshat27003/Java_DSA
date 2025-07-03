package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
       *
      ***
     *****
    ******* 
 */

class Solution7 {
    public void codePattern7(int num) {
        for (int i = 0; i < num; i++) {
            for (int spaces = 0; spaces < (num - i - 1); spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < ((2 * i) + 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution7 solution = new Solution7();
        solution.codePattern7(n);
        sc.close();

    }
}
