package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    A
    B B
    C C C
    D D D D
 */

class Solution16 {
    public void codePattern16(int num) {
        char ch = 'A';
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }
}

public class pattern16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution16 solution = new Solution16();
        solution.codePattern16(n);
        sc.close();
    }
}
