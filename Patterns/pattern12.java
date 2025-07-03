package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    1      1
    12    21
    123  321
    12344321
 */
class Solution12 {
    public void codePattern12(int num) {
        for (int i = 0; i < num; i++) {
            // for increasing numbers.
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }

            // for spaces
            for (int j = 0; j < (2 * (num - i - 1)); j++) {
                System.out.print(" ");
            }

            // for decreasing numbers.
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}

public class pattern12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution12 solution = new Solution12();
        solution.codePattern12(n);
        sc.close();

    }
}
