package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    A
    A B
    A B C
    A B C D
 */

class Solution14 {
    public void codePattern14(int num) {
        for (int i = 0; i < num; i++) {
            // character based loop for printing char.
            for (char ch = 'A'; ch <= ('A' + i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class pattern14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution14 solution = new Solution14();
        solution.codePattern14(n);
        sc.close();
    }
}
