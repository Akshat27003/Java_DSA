package recursionBasics;

import java.util.*;

/*
Given an input string as an array of characters, write a function that reverses the string.


Examples:
(1)
Input : s = ["h", "e", "l", "l", "o"]
Output : ["o", "l", "l", "e", "h"]
Explanation : The given string is s = "hello" and after reversing it becomes s = "olleh".
(2)
Input : s = ["b", "y", "e" ]
Output : ["e", "y", "b"]
Explanation : The given string is s = "bye" and after reversing it becomes s = "eyb".
(3)
Input : s = ["h", "a", "n", "n", "a", "h"]
Output:
["h", "a", "n", "n", "a", "h"]

Constraints:
1 <= s.length <= 10^3
s consist of only lowercase and uppercase English characters.
 */

class Solution4 {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        int n = s.size(); // length method not there.
        reverse(0, (n - 1), s);
        return s;
    }

    private void reverse(int left, int right, ArrayList<Character> s) {
        if (left >= right) {
            return;
        }
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);
        reverse((left + 1), (right - 1), s);
    }
}
// TC: O(N/2), SC: O(N/2).

public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> s = new ArrayList<>();
        int n;
        System.out.println("Enter length of the Character ArrayList: ");
        n = sc.nextInt();
        sc.nextLine(); // consume leftover line and bring to new line.
        System.out.println("Enter Characters into the Character ArrayList (no empty string): ");
        for (int i = 0; i < n; i++) {
            // Input Characters in the ArrayList given by user.
            // make sure empty string is not encountered. otherwise charAt will give error.
            String oneChar = sc.nextLine(); // Enter one char and press enter and do till n times.
            char ch = oneChar.charAt(0); // read the first (here, the only char) of String oneChar at index 0.
            s.add(ch);
        }
        System.out.println("The ArrayList of Characters is: ");
        for (var i : s) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution4 solution = new Solution4();
        ArrayList<Character> reversed = solution.reverseString(s);
        System.out.println("The reverse of the given ArrayList of Characters is: ");
        for (var i : reversed) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
