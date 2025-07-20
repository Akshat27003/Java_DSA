package recursionBasics;

import java.util.*;

/*
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.


Examples:
(1)
Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.
Sum is 1 + 2 + 3 + 4 => 10.
(2)
Input : N = 2
Output : 3
Explanation : first two natural numbers are 1, 2.
Sum is 1 + 2 => 3.
(3)
Input : N = 10
Output:
55

Constraints:
1 <= N <= 10^3

 */

class Solution {
    public int summ(int n) {
        if (n == 0) { // base condition
            return 0;
        }
        return n + summ(n - 1); // recursive calls.
    }
}
// TC: O(N), SC: O(N).

public class sumFirstNnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println("The sum of integers from 1 to n are: " + solution.summ(n));
        sc.close();
    }

}
