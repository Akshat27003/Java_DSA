package basicHashing;

import java.util.*;

/*
Given an array of n integers, find the second most frequent element in it. 
If there are multiple elements that appear a maximum number of times, find the smallest of them. 
If second most frequent element does not exist return -1.


Examples:
(1)
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 2
Explanation: The number 2 appears the second most (2 times) and number 3 appears the most(3 times). 
(2)
Input: arr = [4, 4, 5, 5, 6, 7]
Output: 6
Explanation: Both 6 and 7 appear second most times, but 6 is smaller.
(3)
Input: arr = [10, 9 ,7, 7]
Output:
9

Constraints:
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

class Solution2 {
    public int secondMaxOccuringElt(ArrayList<Integer> arr) {
        int n = arr.size();
        int elt1 = -1;
        int elt2 = -1;
        int maxFreq = 0;
        int secondMaxFreq = 0;

        int maxVal = -1;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, arr.get(i)); // get() method is used to access element with indexing.
        }
        int[] hash = new int[maxVal + 1]; // automatically initialized with 0.
        for (int i = 0; i < n; i++) {
            hash[arr.get(i)]++;
        }

        for (int i = 0; i <= maxVal; i++) {
            if (hash[i] > maxFreq) {
                elt2 = elt1;
                elt1 = i;
                secondMaxFreq = maxFreq;
                maxFreq = hash[i];
            } else if (hash[i] > secondMaxFreq && hash[i] != maxFreq) {
                elt2 = i;
                secondMaxFreq = hash[i];
            }
        }
        return elt2;
    }
}

// TC: 3*O(N), SC: O(maxVal).
public class secondMaxOccurringElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of arr: ");
        n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter elements of arr: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }
        System.out.println("The arr elements are: ");
        for (var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Solution2 solution = new Solution2();
        System.out.println(
                "The element having the second max frequency in the arr is: " + solution.secondMaxOccuringElt(arr));
        sc.close();
    }
}
