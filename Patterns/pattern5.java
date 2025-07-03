package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    * * * *
    * * *
    * *
    *
 */

class Solution5 {
    public void codePattern5(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution5 solution = new Solution5();
        solution.codePattern5(n);
        sc.close();

    }
}
