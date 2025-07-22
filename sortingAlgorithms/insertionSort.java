package sortingAlgorithms;

import java.util.*;

/*
Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.



A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.


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

class Solution3 {
    public int[] insertion(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= (n - 1); i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        return nums;
    }
}
// TC: Average, worst case: O(N^2). Best Case: TC: O(1) -> for nearly sorted or
// sorted arrays.
// SC: O(1).

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The elements of the array before sorting are: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution3 solution = new Solution3();
        nums = solution.insertion(nums);
        System.out.println("The elements of the array after sorting are: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
