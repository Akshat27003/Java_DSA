package sortingAlgorithms;

import java.util.*;

/*
Given an array of integers called nums, sort the array in non-decreasing order using the quick sort algorithm and return the sorted array.



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
1 <= nums.length <= 105
-10^4 <= nums[i] <= 10^4
nums[i] may contain duplicate values.


 */

class Solution5 {
    public int[] quickSortMain(int[] nums) {
        int n = nums.length;
        quickSorHelper(nums, 0, n - 1);
        return nums;
    }

    private void quickSorHelper(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = pivot(nums, low, high);
            quickSorHelper(nums, low, partitionIndex - 1);
            quickSorHelper(nums, partitionIndex + 1, high);
        }
    }

    private int pivot(int[] nums, int low, int high) {
        int pivotElt = nums[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (nums[i] <= pivotElt && i < high) {
                i++;
            }
            while (nums[j] > pivotElt && j > low) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[j];
        nums[j] = nums[low];
        nums[low] = temp;
        return j;
    }
}
// Best, Avg Case TC: O(Nlog2(N)). Worst Case TC: O(N^2).
// Best, Avg Case SC: O(log2(N)) -> recursive call stack space. Worst Case SC:
// O(N) -> recursive call stack space.

public class quickSort {
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
        Solution5 solution = new Solution5();
        nums = solution.quickSortMain(nums);
        System.out.println("The elements of the array after sorting are: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
