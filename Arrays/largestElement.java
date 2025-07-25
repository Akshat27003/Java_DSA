package Arrays;

import java.util.Scanner;

/*
Given an array of integers nums, return the value of the largest element in the array


Examples:
(1)
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6
(2)
Input: nums = [3, 3, 0, 99, -40]
Output: 99
Explanation: The largest element in array is 99
(3)
Input: nums = [-4, -3, 0, 1, -8]
Output:
1

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
nums may contain duplicate elements.


 */

class Solution2 {
    public int largestElementInArray(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}
// TC: O(N)
// SC: O(1)

public class largestElement {

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
        Solution2 solution = new Solution2();
        int largest = solution.largestElementInArray(nums);
        System.out.println("The largest element of the given array is: " + largest);
        sc.close();
    }

}
