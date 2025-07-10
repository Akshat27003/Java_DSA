package basicMath;

import java.util.*;

/*
You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.
You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.

The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.


Examples:
(1)
Input: n1 = 4, n2 = 6
Output(GCD): 2
Output(LCM): 12
(2)
Input: n1 = 9, n2 = 8
Output(GCD): 1
Output(LCM): 72
(3)
Input: n1 = 6, n2 = 12
Output(GCD): 6
Output(LCM): 12
 */

// GCD: using Euclidean Algorithm
// Euclidean Algorithm says that GCD(n1,n2) = GCD(n1-n2,n2) {given that n1>n2}
// LCM: formula: (n1*n2)/GCD
class Solution12 {
    public int getGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        int gcd = 1;
        if (num1 == 0) {
            gcd = num2;
        } else {
            gcd = num1;
        }
        return gcd;
    }

    public int getLCM(int num1, int num2) {
        int gcd = getGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;
        return lcm;
    }
}
// GCD: TC: O(log(min(n1,n2))), SC: O(1)
// LCM: TC: O(log(min(n1,n2))), SC: O(1).

public class gcdAndLCMof2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter first number: ");
        n2 = sc.nextInt();
        Solution12 solution12 = new Solution12();
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + solution12.getGCD(n1, n2));
        System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + solution12.getLCM(n1, n2));
        sc.close();
    }
}
