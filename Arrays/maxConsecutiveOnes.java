package Arrays;

import java.util.*;

/*
Given a binary array nums, return the maximum number of consecutive 1s in the array.



A binary array is an array that contains only 0s and 1s.


Examples:
(1)
Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]
Output: 3
Explanation: The maximum consecutive 1s are present from index 4 to index 6, amounting to 3 1s
(2)
Input: nums = [0, 0, 0, 0, 0, 0, 0, 0]
Output: 0
Explanation: No 1s are present in nums, thus we return 0
(3)
Input: nums = [1, 0, 1, 1, 1, 0, 1, 1, 1]
Output:
3

Constraints:
1 <= nums.length <= 10^5
nums[i] is either 0 or 1.


 */

class Solution4 {
    public int maximumConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cnt++;
                if (cnt > maxi) {
                    maxi = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }
}

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of the binary array: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements in the binary array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The Binary Array is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution4 solution = new Solution4();
        int maxContOnes = solution.maximumConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1s in the Array are: " + maxContOnes);
        sc.close();
    }
}
