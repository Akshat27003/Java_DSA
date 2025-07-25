package Arrays;

import java.util.*;

/*
Given an integer array nums, rotate the array to the left by one.



Note: There is no need to return anything, just modify the given array.


Examples:
(1)
Input: nums = [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]
Explanation: Initially, nums = [1, 2, 3, 4, 5]
Rotating once to left -> nums = [2, 3, 4, 5, 1]
(2)
Input: nums = [-1, 0, 3, 6]
Output: [0, 3, 6, -1]
Explanation: Initially, nums = [-1, 0, 3, 6]
Rotating once to left -> nums = [0, 3, 6, -1]
(3)
Input: nums = [7, 6, 5, 4]
Output:
[6, 5, 4, 7]

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4


 */

class Solution5 {
    public void leftRotate(int[] nums) {
        int temp = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;
    }
}
// TC: O(N), SC: O(1).

public class leftRotateByOne {
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
        Solution5 solution = new Solution5();
        solution.leftRotate(nums);
        System.out.println("The Array after left rotate by 1 is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }

}
