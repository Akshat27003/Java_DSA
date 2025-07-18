package basicStrings;

import java.util.*;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Examples:
(1)
Input : s = "anagram" , t = "nagaram"
Output : true
Explanation : We can rearrange the characters of string s to get string t as frequency of all characters from both strings is same.
(2)
Input : s = "dog" , t = "cat"
Output : false
Explanation : We cannot rearrange the characters of string s to get string t as frequency of all characters from both strings is not same.
(3)
Input : s = "eat" , t = "tea"
Output:
true

Constraints:
1 <= s.length , t.length <= 5*104
s and t consist of only lowercase English letters

 */

class Solution7 {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
// TC:O(N)
// SC: O(26) -> constant.

public class validAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String 1: ");
        s = sc.nextLine();
        String t;
        System.out.println("Enter String 2: ");
        t = sc.nextLine();
        System.out.println("String 1 is: " + s);
        System.out.println("String 2 is: " + t);
        Solution7 solution = new Solution7();
        if (solution.isAnagram(s, t)) {
            System.out.println("The String s is an ANAGRAM of String t.");
        } else {
            System.out.println("The String s is NOT an ANAGRAM of String t.");
        }
        sc.close();
    }
}
