package sortingAlgorithms;

import java.util.*;

/*
Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.



A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.


Examples:
(1)
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.
(2)
Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
Explanation: 1 <= 1 <= 4 <= 4 <= 5.
Thus the array is sorted in non-decreasing order.
(3)
Input: nums = [3, 2, 3, 4, 5]
Output:
[2, 3, 3, 4, 5]

Constraints:
1 <= nums.length <= 1000
-10^4 <= nums[i] <= 10^4
nums[i] may contain duplicate values.


 */

class Solution {
    public int[] selection(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= (n - 2); i++) {
            int mini = i;
            for (int j = i; j <= (n - 1); j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }
        return nums;
    }
}
// TC: O(N^2) -> best, worst, avg case. SC: O(1).

public class selectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of the array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("The array before selection sorting is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution solution = new Solution();
        nums = solution.selection(nums);
        System.out.println("The array after selection sorting is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
