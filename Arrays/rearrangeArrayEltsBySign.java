package Arrays;

import java.util.*;

/*
Given an integer array nums of even length consisting of an equal number of positive and negative integers.


Return the answer array in such a way that the given conditions are met:
Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.

Examples:
(1)
Input : nums = [2, 4, 5, -1, -3, -4]
Output : [2, -1, 4, -3, 5, -4]
Explanation: The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
(2)
Input : nums = [1, -1, -3, -4, 2, 3]
Output : [1, -1, 2, -3, 3, -4]
Explanation: The positive number 1, 2, 3 maintain their relative positions and -1, -3, -4 maintain their relative positions
(3)
Input: nums = [-4, 4, -4, 4, -4, 4]
Output:
[4, -4, 4, -4, 4, -4]

Constraints:
2 <= nums.length <= 10^5
1 <= | nums[i] | <= 10^4
nums.length is an even number.
Number of positive and negative numbers are equal.


 */

class Solution15 {
    public int[] rearrangeArrayElts(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                answer[posIndex] = nums[i];
                posIndex += 2;
            } else {
                answer[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return answer;
    }
}
// TC: O(N)
// SC: O(N)

public class rearrangeArrayEltsBySign {
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
        System.out.println("The Array is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution15 solution = new Solution15();
        int[] rearrangedArr = solution.rearrangeArrayElts(nums);
        System.out.println("The rearranged version of the given array acc to sign is: ");
        for (var i : rearrangedArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
