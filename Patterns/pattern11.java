package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    1
    0 1
    1 0 1
    0 1 0 1
 */

class Solution11 {
    public void codePattern11(int num) {
        for (int i = 0; i < num; i++) {
            int start = 1;
            if (i % 2 == 1) {
                start = 0; // for odd row number.
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // flipping the value of start at each iteration.
            }
            System.out.println();
        }
    }
}

public class pattern11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution11 solution = new Solution11();
        solution.codePattern11(n);
        sc.close();

    }
}
