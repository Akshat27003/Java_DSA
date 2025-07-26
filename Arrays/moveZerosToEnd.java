package Arrays;

import java.util.*;

/*
Given an integer array nums, move all the 0's to the end of the array. 
The relative order of the other elements must remain the same. This must be done in place, without making a copy of the array.


Examples:
(1)
Input: nums = [0, 1, 4, 0, 5, 2]
Output: [1, 4, 5, 2, 0, 0]
Explanation: Both the zeroes are moved to the end and the order of the other elements stay the same
(2)
Input: nums = [0, 0, 0, 1, 3, -2]
Output: [1, 3, -2, 0, 0, 0]
Explanation: All 3 zeroes are moved to the end and the order of the other elements stay the same
(3)
Input: nums = [0, 20, 0, -20, 0, 20]
Output:
[20, -20, 20, 0, 0, 0]

Constraints:
1 <= nums.length <= 10^5
-10^4 <=nums[i] <= 10^4

 */

class Solution7 {
    public void moveZeros(int[] nums) {
        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = (j + 1); i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
// TC: O(N).
// SC: O(1).

public class moveZerosToEnd {
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
        Solution7 solution = new Solution7();
        solution.moveZeros(nums);
        System.out.println("The Array after moving 0s to end is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
