package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
    D
    C D
    B C D
    A B C D
 */

class Solution18 {
    public void codePattern18(int num) {
        for (int i = 0; i < num; i++) {
            char elt = (char) ('A' + num - 1); // explicit typecasting
            for (char ch = (char) (elt - i); ch <= elt; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class pattern18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution18 solution = new Solution18();
        solution.codePattern18(n);
        sc.close();
    }
}
