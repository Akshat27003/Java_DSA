package basicStrings;

import java.util.*;

/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Examples:
(1)
Input : s = "abcde" , goal = "cdeab"
Output : true
Explanation : After performing 2 shifts we can achieve the goal string from string s.
After first shift the string s is => bcdea
After second shift the string s is => cdeab.
(2)
Input : s = "abcde" , goal = "adeac"
Output : false
Explanation : Any number of shift operations cannot convert string s to string goal.
(3)
Input : s = "abcde" , goal = "abcde"
Output:
true

Constraints:
1 <= s.length <= 100
1 <= goal.length <= 100
s and goal consist of only lowercase English letters.
 */

class Solution6 {
    public boolean isRotationPossible(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; // if s and goal are not of same size, we cant get to goal regardless of
                          // rotations.
        }
        String doubleS = s + s; // TC: O(N).
        // SC: O(2*N) -> N is length of string s.
        return doubleS.contains(goal); // Best case , avg case for contains() method, TC: O(N).
        // worst case: O(N*M) -> in case of collision or repetitive pattern.
    }
}
// TC: O(N) : Best, Avg Case
// TC: O(N*M) : Worst Case -> N is length of String s, M is length of
// String goal.
// SC: O(N).

public class rotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter string:");
        s = sc.nextLine();
        String goal;
        System.out.println("Enter goal string:");
        goal = sc.nextLine();
        System.out.println("The string is: " + s);
        System.out.println("The goal string is: " + goal);
        Solution6 solution = new Solution6();
        if (solution.isRotationPossible(s, goal)) {
            System.out.println("The string s can be rotated to get to string goal.");
        } else {
            System.out.println("The string s can not be rotated to get to string goal.");
        }
        sc.close();
    }
}
