package Arrays;

import java.util.*;

/*
Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target 
appears in the array. If the target is not found in the array, return -1


Examples:
(1)
Input: nums = [2, 3, 4, 5, 3], target = 3
Output: 1
Explanation: The first occurence of 3 in nums is at index 1
(2)
Input: nums = [2, -4, 4, 0, 10], target = 6
Output: -1
Explanation: The value 6 does not occur in the array, hence output is -1
(3)
Input: nums = [1, 3, 5, -4, 1], target = 1
Output:
0

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
-10^4 <= target <= 10^4


 */

class Solution {
    public int linearSrch(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
// TC: Best Case: O(1), Worst case: O(N).
// SC: O(1).

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The Array is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        int target;
        System.out.println("Enter element to find in Array: ");
        target = sc.nextInt();
        Solution solution = new Solution();
        int targetIndex = solution.linearSrch(nums, target);
        if (targetIndex == -1) {
            System.out.println("The element is not present in the Array!");
        } else {
            System.out.println("The element is present in the Array at index: " + targetIndex);
        }
        sc.close();
    }
}
