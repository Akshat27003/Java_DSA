package basicStrings;

import java.util.*;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Examples:
(1)
Input : str = ["flowers" , "flow" , "fly", "flight" ]
Output : "fl"
Explanation : All strings given in array contains common prefix "fl".
(2)
Input : str = ["dog" , "cat" , "animal", "monkey" ]
Output : ""
Explanation : There is no common prefix among the given strings in array.
(3)
Input : str = ["lady" , "lazy"]
Output:
"la"

Constraints:
1 <= str.length <= 200
1 <= str[i].length <= 200
str[i] contains only lowercase English letters.
 */

class Solution4 {
    public String lcp(String[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // using inbuilt sort algorithm.
        // sorts array in order of dictionary order of string elements.
        String first = arr[0];
        String last = arr[n - 1];
        String answer = "";
        // Math.min(a,b) -> gives minimum of the 2 values.
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break; // break out if chars mismatch as that means they are not common in both
                       // strings.
            }
            answer += first.charAt(i); // answer+=last.charAt(i) works as well.
        }
        return answer;
    }
}
// TC: O(M) + O(NlogN). M -> length of string, N -> length of Array.
// SC: O(M).

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of the array of Strings: ");
        n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next(); // nextline() breaks at new line.
            // next() considers space separated string as
            // separate elements.
        }
        System.out.println("The array of Strings is: ");
        for (var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution4 solution = new Solution4();
        String answer = solution.lcp(arr);
        if (answer == "") {
            System.out.println("No common prefix exists!");
        } else {
            System.out.println("The longest common prefix among all strings is: " + answer);
        }
        sc.close();
    }

}
