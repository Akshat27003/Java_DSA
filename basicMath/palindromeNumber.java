package basicMath;

import java.util.Scanner;

/*
You are given an integer n. You need to check whether the number is a palindrome number or not. 
Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.

Examples:
(1)
Input: n = 121
Output: true
Explanation: When read from left to right : 121.
When read from right to left : 121.
(2)
Input: n = 123
Output: false
Explanation: When read from left to right : 123.
When read from right to left : 321.
 */

class Solution4 {
    private int reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        return reverse;
    }

    public boolean checkPalindrome(int num) {
        int reverseNum = reverseNum(num);
        return (reverseNum == num);
    }
}
// TC: O(log10(N)), SC: O(1).

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution4 solution4 = new Solution4();
        if (solution4.checkPalindrome(n)) {
            System.out.println("The given number is a PALINDROME NUMBER.");

        } else {
            System.out.println("The given number is NOT a PALINDROME NUMBER.");

        }
        sc.close();
    }
}
