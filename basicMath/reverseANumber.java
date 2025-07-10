package basicMath;

import java.util.Scanner;

/*
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.


Examples:
(1)
Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.
(2)
Input: n = 123
Output: 321
Explanation: Reverse of 123 is 321.
 */

class Solution3 {
    public int reverseGivenNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        return reverse;
    }
}
// TC: O(log10(N)), SC: O(1).

public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution3 solution3 = new Solution3();
        System.out.println("The reverse of the given number is: " + solution3.reverseGivenNumber(n));
        sc.close();
    }
}
