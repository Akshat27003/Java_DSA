package recursionBasics;

import java.util.*;

/*
Given an array nums of n integers, return reverse of the array.


Examples:
(1)
Input : nums = [1, 2, 3, 4, 5]
Output : [5, 4, 3, 2, 1]
(2)
Input : nums = [1, 3, 3, 3, 5]
Output : [5, 3, 3, 3, 1]
(3)
Input : nums = [1, 2, 1]
Output:
[1, 2, 1]

Constraints:
1 <= n <= 100
1 <= nums[i] <= 100

 */

class Solution7 {
    public int[] reverseArray(int[] nums) {
        int n = nums.length;
        reverseArr(0, n - 1, nums);
        return nums;
    }

    private void reverseArr(int left, int right, int[] nums) {
        if (left >= right) {
            return;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        reverseArr(left + 1, right - 1, nums);
    }
}
// TC: O(N/2), SC: O(N/2).

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("The array before reversal is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution7 solution = new Solution7();
        int[] reversedNums = solution.reverseArray(nums);
        System.out.println("The array before reversal is: ");
        for (var i : reversedNums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
