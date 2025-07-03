package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    * * * *
    *     *
    *     *
    * * * *
 */

class Solution21 {
    public void codePattern21(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == (num - 1) || j == 0 || j == (num - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class pattern21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution21 solution = new Solution21();
        solution.codePattern21(n);
        sc.close();
    }
}
