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

class Solution8 {
    public void moveZeros(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        for (int i = temp.size(); i < n; i++) {
            nums[i] = 0;
        }
    }
}
// TC: O(2N)
// SC: O(N)

public class moveZerosToEndBrute {
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
        Solution8 solution = new Solution8();
        solution.moveZeros(nums);
        System.out.println("The Array after moving 0s to end is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
