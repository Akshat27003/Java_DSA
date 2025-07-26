package Arrays;

import java.util.*;

/*
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place 
so that each unique element appears only once. Return the number of unique elements in the array.



If the number of unique elements be k, then,

Change the array nums such that the first k elements of nums contain the unique values in 
the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness.


An array sorted in non-decreasing order is an array where every element to the right of an 
element is either equal to or greater in value than that element.


Examples:
(1)
Input: nums = [0, 0, 3, 3, 5, 6]
Output: 4
Explanation: Resulting array = [0, 3, 5, 6, _, _]
There are 4 distinct elements in nums and the elements marked as _ can have any value.
(2)
Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]
Output: 4
Explanation: Resulting array = [-2, 2, 4, 5, _, _, _, _]
There are 4 distinct elements in nums and the elements marked as _ can have any value.
(3)
Input: nums = [-30, -30, 0, 0, 10, 20, 30, 30]
Select the possible resulting array.
Output:
[-30, 0, 10, 20, 30, _, _, _]

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
nums is sorted in non-decreasing order.
 */

class Solution9 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            ts.add(nums[i]);
        }
        int index = 0;
        for (var itr : ts) {
            nums[index++] = itr;
        }
        return ts.size();
    }
}
// TC: O(NlogN) + O(N) -> logN is the time for adding into the set.
// SC: O(N) -> worst case if all elements are unique.

public class removeDuplicatesFromSortedArrayBrute {
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
        Solution9 solution = new Solution9();
        int targetIndex = solution.removeDuplicates(nums);
        System.out.println("The no of unique elements in the array is: " + targetIndex);
        System.out.println("The Array after removing duplicates is: ");
        for (int i = 0; i < targetIndex; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
