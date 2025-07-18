package basicStrings;

import java.util.*;

/*
Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic 
if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.


Examples:
(1)
Input : s = "egg" , t = "add"
Output : true
Explanation : The 'e' in string s can be replaced with 'a' of string t.
The 'g' in string s can be replaced with 'd' of t.
Hence all characters in s can be replaced to get t.
(2)
Input : s = "apple" , t = "bbnbm"
Output : false
Explanation : It can be proved that no solution exists for this example.
All the "b"s in t have to take places of "a", "p", "l", which requires "p" to be mapped to "b", but that makes it impossible for "p" at index 2 (0-indexed) to become "n". Thus no solution exists.
(3)
Input : s = "paper" , t = "title"
Output:
true

Constraints:
1 <= s.length <= 103
s.length == t.length
s and t consist of only lowercase English letters.

 */

class Solution5 {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        for (int i = 0; i < s.length(); i++) {
            // check if char at ith index of string s is visited previously.
            // if char is visited, check if mapping is consistent.
            if (sMap[s.charAt(i)] != 0 && sMap[s.charAt(i)] != t.charAt(i) + 1) {
                return false;
            }
            // check if char at ith index of string t is visited previously.
            // if char is visited, check if mapping is consistent.
            if (tMap[t.charAt(i)] != 0 && tMap[t.charAt(i)] != s.charAt(i) + 1) {
                return false;
            }
            sMap[s.charAt(i)] = t.charAt(i) + 1; // char is typecast into int everywhere.
            tMap[t.charAt(i)] = s.charAt(i) + 1; // char is typecast into int everywhere.
        }
        return true;
    }
}
// TC: O(N)
// SC: O(2*256) -> constant.

public class isomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, t;
        System.out.println("Enter string 1:");
        s = sc.nextLine();
        System.out.println("Enter string 2:");
        t = sc.nextLine();
        System.out.println("The first string is: " + s);
        System.out.println("The second string is: " + t);
        Solution5 solution = new Solution5();
        if (solution.isIsomorphic(s, t)) {
            System.out.println("The 2 string are ISOMORPHIC.");
        } else {
            System.out.println("The 2 strings are NOT ISOMORPHIC.");
        }
        sc.close();
    }

}
