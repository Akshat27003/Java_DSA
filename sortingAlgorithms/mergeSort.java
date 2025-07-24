package sortingAlgorithms;

import java.util.*;

/*
Given an array of integers, nums,sort the array in non-decreasing order using the merge sort algorithm. Return the sorted array.

A sorted array in non-decreasing order is one in which each element is either greater than or equal to all the elements to its left in the array.


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
1 <= nums.length <= 106
-10^4 <= nums[i] <= 10^4
nums[i] may contain duplicate values.


 */

class Solution4 {
    public int[] mergeSortMain(int[] nums) {
        int n = nums.length;
        mergeSortHelper(nums, 0, (n - 1)); // void function with required parameters.
        return nums;
    }

    private void mergeSortHelper(int[] nums, int low, int high) {
        if (low >= high) // base case... means 1 element only in subarray.
        {
            return;
        }
        int mid = (low + high) / 2;
        // dividing into nearly 2 (N/2) size subarrays using indexes.
        mergeSortHelper(nums, low, mid);
        mergeSortHelper(nums, mid + 1, high);

        merge(nums, low, mid, high); // merging array from bottom to top after dividing into subarrays.
    }

    private void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) // maintains order. stable.
            {
                al.add(nums[left]);
                left++;
            } else {
                al.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            al.add(nums[left]);
            left++;
        }

        while (right <= high) {
            al.add(nums[right]);
            right++;
        }
        // transfer back from ArrayList al to Array nums.
        for (int i = low; i <= high; i++) {
            nums[i] = al.get(i - low);
        }
    }
}
// TC: O(N log N) -> mainly due to merge() at each level. a lot of overhead
// insignificant in comparison to O(N log N) is ignored.
// SC: O(N) -> for temp array. O(log N) for maintaining recursive call stack is
// insignificant in comparison to O(N).

public class mergeSort {
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
        Solution4 solution = new Solution4();
        nums = solution.mergeSortMain(nums);
        System.out.println("The elements of the array after sorting are: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
