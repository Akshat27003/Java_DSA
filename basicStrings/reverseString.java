package basicStrings;

import java.util.*;

/*
Given a string, the task is to reverse it. The string is represented by an array of 
characters s. Perform the reversal in place with O(1) extra memory.



Note: no need to return anything, modify the given list.


Examples:
(1)
Input : s = ["h", "e" ,"l" ,"l" ,"o"]
Output : ["o", "l", "l", "e", "h"]
Explanation : The given string is s = "hello" and after reversing it becomes s = "olleh".
(2)
Input : s = ["b", "y" ,"e" ]
Output : ["e", "y", "b"]
Explanation : The given string is s = "bye" and after reversing it becomes s = "eyb".
(3)
Input : s = ["h", "a" ,"n" ,"n" ,"a", "h"]
Output:
["h", "a" ,"n" ,"n" ,"a", "h"]

Constraints:
1 <= s.length <= 105
s consist of only lowercase and uppercase English characters.

 */

class Solution {
    public StringBuilder reversalOfString(StringBuilder sb) {
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            char temp = sb.charAt(i); // s.charAt(i) gives char at index i of a string s.
            sb.setCharAt(i, sb.charAt(j)); // s.setCharAt(i,sb.charAt(j)) sets the ith index of string s same as charAt
                                           // jth index.
            // equivalent to s[i] = s[j] of c++
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb;
    }
}
// TC: O(N), SC: O(1).

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s); // StringBuilder class is just like Strings.
        // But StringBuilder is mutable.
        System.out.println("The string is: " + sb);
        Solution solution = new Solution();
        System.out.println("The reverse of the given String is: " + solution.reversalOfString(sb));
        sc.close();
    }
}
