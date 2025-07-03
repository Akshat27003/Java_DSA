package Patterns;

import java.util.Scanner;

/*
    Pattern for n=4:
    * * * *
    * * * *
    * * * *
    * * * *
 */

class Solution1 {
    public void codePattern1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class pattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution1 solution = new Solution1();
        solution.codePattern1(n);
        sc.close();

    }
}
