package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    1 2 3 4
    1 2 3
    1 2
    1
 */

class Solution6 {
    public void codePattern6(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}

public class pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution6 solution = new Solution6();
        solution.codePattern6(n);
        sc.close();

    }
}
