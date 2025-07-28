package Arrays;

import java.util.*;

/*
Given an integer array nums, return a list of all the leaders in the array.



A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. 
The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.


Examples:
(1)
Input: nums = [1, 2, 5, 3, 1, 2]
Output: [5, 3, 2]
Explanation: 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]
(2)
Input: nums = [-3, 4, 5, 1, -4, -5]
Output: [5, 1, -4, -5]
Explanation: -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] 
and 5 is the largest element in the range [2, 5]
(3)
Input: nums = [-3, 4, 5, 1, -30, -10]
Output:
[5, 1, -10]

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4

 
 */

class Solution14 {
    public ArrayList<Integer> leadersInGivenArray(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = (n - 1); i >= 0; i--) {
            if (nums[i] > maxi) {
                al.add(nums[i]);
                maxi = nums[i];
            }
        }
        Collections.reverse(al);
        return al;
    }
    // TC: O(N) + O(N) -> O(N) for iterating through. O(N) for reversing.
    // SC: O(N) -> for storing and returning the answer.
}

public class leadersInArray {
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
        Solution14 solution = new Solution14();
        ArrayList<Integer> leaders = solution.leadersInGivenArray(nums);
        System.out.println("The leaders in the given array is: ");
        for (var i : leaders) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
