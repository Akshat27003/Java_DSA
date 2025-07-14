package basicHashing;

import java.util.*;

/*
Given an array of n integers, find the sum of the frequencies of the highest occurring number and lowest occurring number.


Examples:
(1)
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 4
Explanation: The highest frequency is 3 (element 3), and the lowest frequency is 1 (element 1). Their sum is 3 + 1 = 4.
(2)
Input: arr = [4, 4, 5, 5, 6]
Output: 3
Explanation: The highest frequency is 2 (elements 4 and 5), and the lowest frequency is 1 (element 6). Their sum is 2 + 1 = 3.
(3)
Input: arr = [10, 9, 7, 7, 8, 8, 8]
Output:
4

Constraints:
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

class Solution3 {
    public int sumMaxAndLeastFreqElt(ArrayList<Integer> arr) {
        int n = arr.size();
        int maxFreq = 0;
        int leastFreq = n;

        int maxVal = -1;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, arr.get(i)); // get() method is used to access element with indexing.
        }
        int[] hash = new int[maxVal + 1]; // automatically initialized with 0.
        for (int i = 0; i < n; i++) {
            hash[arr.get(i)]++;
        }

        for (int i = 0; i <= maxVal; i++) {
            if (hash[i] != 0) {
                maxFreq = Math.max(maxFreq, hash[i]);
                leastFreq = Math.min(leastFreq, hash[i]);
            }
        }
        int answer = maxFreq + leastFreq;
        return answer;
    }
}

// TC: 3*O(N), SC: O(maxVal).
public class sumOfHighestFreqAndLowestFrequency {
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

        Solution3 solution = new Solution3();
        System.out.println(
                "The sum of the frequencies of the highest occurring number and lowest occurring number: "
                        + solution.sumMaxAndLeastFreqElt(arr));
        sc.close();
    }
}