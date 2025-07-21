package recursionBasics;

import java.util.*;

/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.


Examples:
(1)
Input : num = 529
Output : 7
Explanation : In first iteration the digits sum will be = 5 + 2 + 9 => 16
In second iteration the digits sum will be 1 + 6 => 7.
Now single digit is remaining , so we return it.
(2)
Input : num = 101
Output : 2
Explanation : In first iteration the digits sum will be = 1 + 0 + 1 => 2
Now single digit is remaining , so we return it.
(3)
Input : num = 38
Output:
2

Constraints:
0 <= num <= 2^31 - 1


 */

class Solution9 {
    public int addDigits(int num) {
        if (num < 10) // if single digit remains in sum.
        {
            return num;
        }

        return addDigits(summ(num)); // passing num to summ func till only 1 digit remains in num.
    }

    private int summ(int num) {
        if (num == 0) // if no digit remains to traverse for summation.
        {
            return 0;
        }

        return (num % 10) + summ(num / 10); // adding last digit and recursively calling summ function for summation of
                                            // remaining digits.
    }
}
// TC: O(log10(N))
// SC: I(log10(N))

public class sumOfDigitsInAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        Solution9 solution = new Solution9();
        System.out.println(
                "The sum after all digits repeatedly till we get only 1 digit in sum is: " + solution.addDigits(n));
        sc.close();
    }

}
