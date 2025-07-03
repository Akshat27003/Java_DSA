package Patterns;

import java.util.Scanner;

/*
    for n=4, print:
       *
      ***
     *****
    *******
    *******
     *****
      ***
       *
 */

class Solution9 {

    // make those functions private which are only needed in current class.
    private void codeUpperHalvePattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int spaces = 0; spaces < (num - i - 1); spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < ((2 * i) + 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // make those functions private which are only needed in current class.
    private void codeLowerHalvePattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < ((2 * num) - (2 * i) - 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void codePattern9(int num) {
        // upper half and lower half are symmetrical.
        // we can code it separately.
        // and calll it here.
        codeUpperHalvePattern(num);
        codeLowerHalvePattern(num);
    }
}

public class pattern9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Solution9 solution = new Solution9();
        solution.codePattern9(n);
        sc.close();

    }
}
