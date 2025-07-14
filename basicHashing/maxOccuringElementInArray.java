package basicHashing;

import java.util.*;

/*
Given an array of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. 
If there are multiple elements that appear a maximum number of times, find the smallest of them.

Please note that this section might seem a bit difficult without prior knowledge on what hashing is, 
we will soon try to add basics concepts for your ease! If you know the concepts already please go 
ahead to give a shot to the problem. Cheers!


Examples:
(1)
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 3
Explanation: The number 3 appears the most (3 times). It is the most frequent element.
(2)
Input: arr = [4, 4, 5, 5, 6]
Output: 4
Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
(3)
Input: arr = [10, 9 ,7]
Output:
7

Constraints:
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

class Solution {
    public int maxOccuringElt(ArrayList<Integer> arr) {
        int n = arr.size();
        int elt = -1;
        int maxCnt = 0;
        int maxVal = -1;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, arr.get(i)); // get() method is used to access element with indexing.
        }
        int[] hash = new int[maxVal + 1]; // automatically initialized with 0.
        for (int i = 0; i < n; i++) {
            hash[arr.get(i)]++;
        }

        for (int i = 0; i <= maxVal; i++) {
            if (hash[i] > maxCnt) {
                maxCnt = hash[i];
                elt = i;
            }
        }
        return elt;
    }
}

// TC: 3*O(N), SC: O(maxVal).
public class maxOccuringElementInArray {
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

        Solution solution = new Solution();
        System.out.println("The element having the max frequency in the arr is: " + solution.maxOccuringElt(arr));
        sc.close();
    }
}
