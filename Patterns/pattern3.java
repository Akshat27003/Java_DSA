package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    1
    1 2
    1 2 3
    1 2 3 4
 */
class Solution3 {
    public void codePattern3(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}

public class pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution3 solution = new Solution3();
        solution.codePattern3(n);
        sc.close();

    }
}
