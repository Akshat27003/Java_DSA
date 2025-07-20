package recursionBasics;

import java.util.*;

/*
Given a string s, return true if the string is palindrome, otherwise false.



A string is called palindrome if it reads the same forward and backward.


Examples:
(1)
Input : s = "hannah"
Output : true
Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.
(2)
Input : s = "aabbaaa"
Output : false
Explanation : The string when reversed is --> "aaabbaa", which is not same as original string, So we return false.
(3)
Input : s = "aabbcccdbbaa"
Output:
false

Constraints:
1 <= s.length <= 10^3
s consist of only uppercase and lowercase English characters.

 */

class Solution5 {
    public boolean checkPalindrome(String s) {
        int n = s.length();
        return isPalindrome(0, n - 1, s);
    }

    private boolean isPalindrome(int left, int right, String s) {
        if (left >= right) // base condition 1
        {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) { // base condition 2.
            return false;
        }
        return isPalindrome(left + 1, right - 1, s);
    }
}
// TC: O(N/2), SC: O(N/2).

public class checkIfStringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        System.out.println("The string is: " + s);
        Solution5 solution = new Solution5();
        if (solution.checkPalindrome(s)) {
            System.out.println("The given string is PALINDROME.");
        } else {
            System.out.println("The given string is NOT PALINDROME.");
        }
        sc.close();
    }
}
