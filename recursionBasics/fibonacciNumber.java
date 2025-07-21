package recursionBasics;

import java.util.*;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Given n, calculate F(n).

Examples:
(1)
Input : n = 2
Output : 1
Explanation : F(2) = F(1) + F(0) => 1 + 0 => 1.
(2)
Input : n = 3
Output : 2
Explanation : F(3) = F(2) + F(1) => 1 + 1 => 2.
(3)
Input : n = 6
Output:
8

Constraints:
0 <= n <= 20


 */

class Solution10 {
    public int fibo(int n) {
        if (n <= 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
// TC: O(2^N)
// SC: O(N).

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        Solution10 solution = new Solution10();
        System.out.println("nth Fibonacci Number of the sequence is: " + solution.fibo(n));
        sc.close();
    }

}
