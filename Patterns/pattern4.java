package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    1
    2 2
    3 3 3
    4 4 4 4
 */

class Solution4 {
    public void codePattern4(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}

public class pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution4 solution = new Solution4();
        solution.codePattern4(n);
        sc.close();

    }
}
