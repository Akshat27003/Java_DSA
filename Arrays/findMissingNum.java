package Arrays;

import java.util.*;

/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), 
return the only number missing from the array within this range.


Examples:
(1)
Input: nums = [0, 2, 3, 1, 4]
Output: 5
Explanation: nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
(2)
Input: nums = [0, 1, 2, 4, 5, 6]
Output: 3
Explanation: nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]
(3)
Input: nums = [1, 3, 6, 4, 2, 5]
Output:
0

Constraints:
n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.


 */

class Solution11 {
    public int findMissingBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    flag = true;
                }
            }
            if (!flag) {
                return i;
            }
        }
        return -1; // fallback
    }
    // TC: O(N^2)
    // SC: O(1)

    public int findMissingBetter(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]] = 1;
        }
        for (int i = 0; i < (n + 1); i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1; // fallback.
    }
    // TC: O(2N)
    // SC: O(N)

    public int findMissingOptimalUsingSum(int[] nums) {
        int n = nums.length;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += nums[i];
        }
        return (sum1 - sum2);
    }
    // TC: O(N)
    // SC: O(1)
    // chances of int overflow is there.

    public int findMissingOptimalUsingXOR(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i + 1);
        }
        return (xor1 ^ xor2);
    }
    // TC: O(N)
    // SC: O(1)
    // xor slightly faster than sum as bitwise operators are faster.
    // also xor will max to max be the max num in the array.
    // no chance of overflow out of range.
}

public class findMissingNum {
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
        Solution11 solution = new Solution11();
        int element = solution.findMissingBrute(nums);
        int element2 = solution.findMissingBetter(nums);
        int element3 = solution.findMissingOptimalUsingSum(nums);
        int element4 = solution.findMissingOptimalUsingXOR(nums);
        System.out.println("The number missing in the given array is (using brute force): " + element);
        System.out.println("The number missing in the given array is (using better approach): " + element2);
        System.out.println("The number missing in the given array is (using optimal approach): " + element3);
        System.out.println("The number missing in the given array is (using optimal approach 2): " + element4);

        sc.close();
    }
}
