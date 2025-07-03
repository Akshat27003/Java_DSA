package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    1
    2 3
    4 5 6
    7 8 9 10
 */

class Solution13 {
    public void codePattern13(int num) {
        int val = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}

public class pattern13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution13 solution = new Solution13();
        solution.codePattern13(n);
        sc.close();
    }
}
