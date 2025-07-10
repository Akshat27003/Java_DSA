package basicMath;

import java.util.*;

/*
You are given an integer n. You need to check whether it is an armstrong number or not. 
Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

Examples:
(1)
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.
(2)
Input: n = 12
Output: false
Explanation: Number of digits : 2.
12 + 22 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.
(3)
Input: n = 370
Output:
true
 */

class Solution8 {
    public boolean checkArmstrong(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        int sum = 0;
        int duplicateNum = num;
        while (duplicateNum != 0) {
            int lastDigit = duplicateNum % 10;
            sum = sum + (int) (Math.pow(lastDigit, digits));
            duplicateNum = duplicateNum / 10;
        }
        return (num == sum);
    }
}
// TC: O(log10(N)*log2(log10(N))), SC: O(1).
// O(log2(exponent)) is the TC of pow() method of Math class.

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution8 solution8 = new Solution8();
        if (solution8.checkArmstrong(n)) {
            System.out.println("The given number is an ARMSTRONG NUMBER.");

        } else {
            System.out.println("The given number is NOT an ARMSTRONG NUMBER.");

        }
        sc.close();
    }
}
