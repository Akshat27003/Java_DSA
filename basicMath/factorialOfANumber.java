package basicMath;

import java.util.*;

/*
You are given an integer n. Return the value of n! or n factorial.
Factorial of a number is the product of all positive integers less than or equal to that number.


Examples:
(1)
Input: n = 2
Output: 2
Explanation: 2! = 1 * 2 = 2.
(2)
Input: n = 0
Output: 1
Explanation: 0! is defined as 1
(#)
Input: 3
Output:
6
 */

class Solution7 {
    public int getFactorial(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
// TC: O(N), SC: O(1).

public class factorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number from 1 to 12:");
        n = sc.nextInt();
        Solution7 solution7 = new Solution7();
        System.out.println("The factorial of the given number is: " + solution7.getFactorial(n));
        sc.close();
    }
}
