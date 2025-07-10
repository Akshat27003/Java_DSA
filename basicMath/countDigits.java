package basicMath;

import java.util.*;

/*
You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Examples:
(1)
Input: n = 4
Output: 1
Explanation: There is only 1 digit in 4.
(2)
Input: n = 14
Output: 2
Explanation: There are 2 digits in 14.
 */

class Solution {
    public int countDigitsOfNumber(int num) {
        int digits;
        if (num == 0) {
            return 1;
        } else {
            digits = (int) Math.log10(num) + 1;
            // log10() method is in Math class.
            // takes double val
            // return double val
            // typecast to val.
            // lossy conversion possible.
        }
        return digits;
    }
}
// TC: O(log10(N)), SC:O(1).

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println("The number of digits in the given number is: " + solution.countDigitsOfNumber(n));
        sc.close();
    }
}
