package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    *
    * *
    * * *
    * * * *    
 */

class Solution2 {
    public void codePattern2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution2 solution = new Solution2();
        solution.codePattern2(n);
        sc.close();
    }
}
