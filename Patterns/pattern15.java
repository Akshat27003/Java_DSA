package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    A B C D
    A B C
    A B
    A
 */

class Solution15 {
    public void codePattern15(int num) {
        for (int i = 0; i < num; i++) {
            // char based loop for printing.
            for (char ch = 'A'; ch <= ('A' + (num - i - 1)); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class pattern15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution15 solution = new Solution15();
        solution.codePattern15(n);
        sc.close();
    }
}
