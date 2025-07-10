package basicMath;

import java.util.*;

/*
You are given an integer n. You need to check if the number is a perfect number or not. 
Return true if it is a perfect number, otherwise, return false.
A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.

Examples:
(1)
Input: n = 6
Output: true
Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6.
(2)
Input: n = 4
Output: false
Explanation: Proper divisors of 4 are 1, 2.
1 + 2 = 3.
(3)
Input: n = 28
Output:
true
 */

class Solution9 {
    public boolean checkPerfectNum(int num) {
        // edge case of 1. (it is not perfect.)
        if (num == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; (i * i) <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                if (i != (num / i)) {
                    sum = sum + (num / i);
                }
            }
        }
        return (num == sum);
    }
}
// TC: O(sqrt(N)), SC: O(1).

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution9 solution9 = new Solution9();
        if (solution9.checkPerfectNum(n)) {
            System.out.println("The given number is a PERFECT NUMBER.");

        } else {
            System.out.println("The given number is NOT a PERFECT NUMBER.");

        }
        sc.close();
    }

}
