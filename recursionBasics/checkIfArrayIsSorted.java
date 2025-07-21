package recursionBasics;

import java.util.*;

/*
Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.


Examples:
(1)
Input : nums = [1, 2, 3, 4, 5]
Output : true
Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.
(2)
Input : nums = [1, 2, 1, 4, 5]
Output : false
Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.
(3)
Input : nums = [1,9,6,8,5,4,0]
Output:
false

Constraints:
1 <= n <= 100
1 <= nums[i] <= 100

 */

class Solution8 {
    public boolean isSorted(ArrayList<Integer> nums) {
        int n = nums.size();
        return isArraySorted(0, n, nums);
    }

    private boolean isArraySorted(int i, int n, ArrayList<Integer> nums) {
        if (i >= (n - 1)) {
            return true;
        }
        if (nums.get(i) > nums.get(i + 1)) {
            return false;
        }
        return isArraySorted(i + 1, n, nums);
    }
}
// TC: O(N), SC: O(N).

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of Array: ");
        n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter elements of the Array: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            nums.add(val);
        }
        System.out.println("The array is: ");
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution8 solution = new Solution8();
        if (solution.isSorted(nums)) {
            System.out.println("The given array is SORTED in NON DECREASING ORDER.");
        } else {
            System.out.println("The given array is NOT SORTED in NON DECREASING ORDER.");
        }
        sc.close();
    }

}
