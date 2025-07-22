package sortingAlgorithms;

import java.util.*;

/*
Given an array of integers called nums,sort the array in non-decreasing order using the bubble sort algorithm and return the sorted array.



A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.


Examples:
Input: nums = [7, 4, 1, 5, 3]

Output: [1, 3, 4, 5, 7]

Explanation: 1 <= 3 <= 4 <= 5 <= 7.

Thus the array is sorted in non-decreasing order.

Input: nums = [5, 4, 4, 1, 1]

Output: [1, 1, 4, 4, 5]

Explanation: 1 <= 1 <= 4 <= 4 <= 5.

Thus the array is sorted in non-decreasing order.

Input: nums = [3, 2, 3, 4, 5]

Output:
[2, 3, 3, 4, 5]
Constraints:
1 <= nums.length <= 1000
-10^4 <= nums[i] <= 10^4
nums[i] may contain duplicate values.


 */

class Solution2 {
    public int[] bubble(int[] nums) {
        int n = nums.length;
        for (int i = (n - 1); i >= 1; i--) {
            boolean didSwap = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (didSwap == false) {
                break;
            }
        }
        return nums;
    }
}
// TC: O(N^2) -> avg and worst case. SC: O(1).
// TC: O(N) -> best case (sorted or nearly sorted array).

public class bubbleSort {

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

        System.out.println("The array before bubble sorting is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution2 solution = new Solution2();
        nums = solution.bubble(nums);
        System.out.println("The array after bubble sorting is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
