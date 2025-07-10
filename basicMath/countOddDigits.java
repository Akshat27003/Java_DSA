package basicMath;

import java.util.*;

/*
You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.


Examples:
(1)
Input: n = 5
Output: 1
Explanation: 5 is an odd digit.
(2)
Input: n = 25
Output: 1
Explanation: The only odd digit in 25 is 5.
 */

class Solution2 {
    public int countOddDigitsInANumber(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 1) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
// TC: O(log10(N)), SC:O(1).

public class countOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution2 solution2 = new Solution2();
        System.out.println("The number of odd digits in the given number is: " + solution2.countOddDigitsInANumber(n));
        sc.close();
    }
}
