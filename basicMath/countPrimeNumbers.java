package basicMath;

import java.util.*;

/*
You are given an integer n. You need to find out the number of prime numbers in the range [1, n] (inclusive). 
Return the number of prime numbers in the range.
A prime number is a number which has no divisors except, 1 and itself.
Examples:
(1)
Input: n = 6
Output: 3
Explanation: Prime numbers in the range [1, 6] are 2, 3, 5.
(2)
Input: n = 10
Output: 4
Explanation: Prime numbers in the range [1, 10] are 2, 3, 5, 7.
(3)
Input: n = 20
Output:
8
 */

class Solution11 {
    private boolean checkPrime(int num) {
        // edge case
        if (num == 1) {
            return false;
        }
        for (int i = 2; (i * i) <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeInRange(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (checkPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
// TC: O(N*sqrt(N)), SC: O(1).

public class countPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution11 solution11 = new Solution11();
        System.out.println(
                "Total number of PRIME NUMBERS between 1 and " + n + " are: " + solution11.countPrimeInRange(n));
        sc.close();
    }
}
