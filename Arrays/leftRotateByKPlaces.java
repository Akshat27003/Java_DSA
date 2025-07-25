package Arrays;

import java.util.*;

/*
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.


Examples:
(1)
Input: nums = [1, 2, 3, 4, 5, 6], k = 2
Output: nums = [3, 4, 5, 6, 1, 2]
Explanation: 
rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
(2)
Input: nums = [3, 4, 1, 5, 3, -5], k = 8
Output: nums = [1, 5, 3, -5, 3, 4]
Explanation: 
rotate 1 step to the left: [4, 1, 5, 3, -5, 3]
rotate 2 steps to the left: [1, 5, 3, -5, 3, 4]
rotate 3 steps to the left: [5, 3, -5, 3, 4, 1]
rotate 4 steps to the left: [3, -5, 3, 4, 1, 5]
rotate 5 steps to the left: [-5, 3, 4, 1, 5, 3]
rotate 6 steps to the left: [3, 4, 1, 5, 3, -5]
rotate 7 steps to the left: [4, 1, 5, 3, -5, 3]
rotate 8 steps to the left: [1, 5, 3, -5, 3, 4]
(3)
Input: nums = [1, 2, 3, 4, 5], k = 4
Output:
[5, 1, 2, 3, 4]

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
0 <= k <= 10^5
 */

class Solution6 {
    public void leftRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
// TC: O(2*N)
// SC: O(1)

public class leftRotateByKPlaces {
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
        int k;
        System.out.println("Enter the number by which the element to be left rotated: ");
        k = sc.nextInt();
        Solution6 solution = new Solution6();
        solution.leftRotate(nums, k);
        System.out.println("The Array after left rotate by " + k + " is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
