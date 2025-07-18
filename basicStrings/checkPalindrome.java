package basicStrings;

import java.util.*;

/*
You are given a string s. Return true if the string is palindrome, otherwise false. 
A string is called palindrome if it reads the same forward and backward.


Examples:
(1)
Input : s = "hannah"
Output : true
Explanation : The given string when read backward is -> "hannah", which is same as when read forward.
Hence answer is true.
(2)
Input : s = "aabbaaa"
Output : false
Explanation : The given string when read backward is -> "aaabbaa", which is not same as when read forward.
Hence answer is false.
(3)
Input : s = "aabbccbbaa"
Output:
true

Constraints:
1 <= s.length <= 105
s consist of only uppercase and lowercase English characters.


 */

class Solution2 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
// TC: O(N), SC: O(1).

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        System.out.println("The string is: " + s);
        Solution2 solution = new Solution2();
        if (solution.isPalindrome(s)) {
            System.out.println("The given string is a PALINDROME.");
        } else {
            System.out.println("The given string is NOT a PALINDROME.");
        }
        sc.close();
    }

}
