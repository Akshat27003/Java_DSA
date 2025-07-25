package Arrays;

import java.util.Scanner;

/*
Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Examples:
(1)
Input: nums = [8, 8, 7, 6, 5]
Output: 7
Explanation: The largest value in nums is 8, the second largest is 7
(2)
Input: nums = [10, 10, 10, 10, 10]
Output: -1
Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned
(3)
Input: nums = [7, 7, 2, 2, 10, 10, 10]
Output:
7

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
nums may contain duplicate elements.


 */

class Solution3 {
    public int secondLargestElementInArray(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        int sLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > sLargest) {
                sLargest = nums[i];
            }
        }
        if (sLargest == Integer.MIN_VALUE) {
            sLargest = -1;
        }
        return sLargest;
    }
}
// TC: O(N), SC: O(1)

public class secondLargestElement {
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
        Solution3 solution = new Solution3();
        int secondLargest = solution.secondLargestElementInArray(nums);
        if (secondLargest == -1) {
            System.out.println("Second Largest Element DOES NOT EXIST!");
        } else {
            System.out.println("The second largest element of the given array is: " + secondLargest);
        }
        sc.close();
    }

}
