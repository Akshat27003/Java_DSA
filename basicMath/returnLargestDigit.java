package basicMath;

import java.util.Scanner;

/*
You are given an integer n. Return the largest digit present in the number.

Examples:
(1)
Input: n = 25
Output: 5
Explanation: The largest digit in 25 is 5.
(2)
Input: n = 99
Output: 9
Explanation: The largest digit in 99 is 9.
(3)
Input: n = 1
Output:
1
 */

class Solution5 {
    public int getLargestDigit(int num) {
        int largest = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num = num / 10;
        }
        return largest;
    }
}
// TC: O(log10(N)), SC: O(1).

public class returnLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution5 solution5 = new Solution5();
        System.out.println("The largest digit of the given number is: " + solution5.getLargestDigit(n));
        sc.close();
    }
}
