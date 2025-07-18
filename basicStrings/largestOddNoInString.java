package basicStrings;

import java.util.*;

/*
Given a string s, representing a large integer, the task is to return the largest-valued odd integer 
(as a string) that is a substring of the given string s.

The number returned should not have leading zero's. But the given input string may have leading zero.


Examples:
(1)
Input : s = "5347"
Output : "5347"
Explanation : The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.
(2)
Input : s = "0214638"
Output : "21463"
Explanation : The different odd numbers that can be formed by the given string are --> 1, 3, 21, 63, 463, 1463, 21463.
We cannot include 021463 as the number contains leading zero.
So largest odd number in given string is 21463.
(3)
Input : s = "0032579"
Output:
"32579"

Constraints:
1 <= s.length <= 103
'0' <= s[i] <= '9'

 */

class Solution3 {
    public String largestOddNo(String s) {
        int endIndex = -1;
        int n = s.length();
        for (int i = (n - 1); i >= 0; i--) {
            // ascii subtraction.
            if ((s.charAt(i) - '0') % 2 == 1) // last possible odd digit index of string s
            {
                endIndex = i; // endIndex of returning substring.
                break;
            }
        }
        if (endIndex == -1) {
            return ""; // if no odd digit found.
        }
        int startIndex = 0;
        while (startIndex < (n - 1)) {
            if (s.charAt(startIndex) != '0') { // removing leading zeros from string before taking substring.
                break;
            }
            startIndex++;
        }
        return s.substring(startIndex, endIndex + 1); // return substring from startIndex to endIndex+1.
        // endIndex+1 is not included in substring in Java.
    }
}
// TC: O(N), Auxiliary Space: O(1), Space for storing returning string: O(N).

public class largestOddNoInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string (all numeric characters): ");
        s = sc.nextLine();
        System.out.println("The string is: " + s);
        Solution3 solution = new Solution3();
        String answer = solution.largestOddNo(s);
        if (answer == "") {
            System.out.println("No odd integer was possible");
        } else {
            System.out.println("The largest odd integer possible from the given string is: " + answer);
        }

        sc.close();
    }
}
