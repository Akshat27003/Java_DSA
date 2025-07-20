package recursionBasics;

import java.util.*;

/*
Given an integer n, return the factorial of n.



Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n (use 64-bits to return answer).


Examples:
(1)
Input : n = 3
Output : 6
Explanation : Factorial = 1 * 2 * 3 => 6
(2)
Input : n = 5
Output : 120
Explanation : Factorial = 1 * 2 * 3 * 4 * 5 => 120
(3)
Input : n = 4
Output:
24

Constraints:
0 <= n <= 15

 */

class Solution2 {
    public long fact(int n) {
        if (n <= 1) // base condition
        {
            return 1;
        }
        return n * fact(n - 1);
    }
}
// TC: O(N), SC: O(N)

public class factorialN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: (from 1 to 15): ");
        n = sc.nextInt();
        Solution2 solution = new Solution2();
        System.out.println("The factorial of the given number is: " + solution.fact(n));
        sc.close();
    }

}
