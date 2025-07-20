package recursionBasics;

import java.util.*;

/*
Given an array nums, find the sum of elements of array using recursion.


Examples:
(1)
Input : nums = [1, 2, 3]
Output : 6
Explanation : The sum of elements of array is 1 + 2 + 3 => 6.
(2)
Input : nums = [5, 8, 1]
Output : 14
Explanation : The sum of elements of array is 5 + 8 + 1 => 14.
(3)
Input : nums = [12, 9, 17]
Output:
38

Constraints:
1 <= n <= 100
1 <= nums[i] <= 100
 */

class Solution3 {
    public int arraySum(int[] arr) {
        return summ(arr, 0);
    }

    private int summ(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        return arr[i] + summ(arr, i + 1);
    }
}
// TC: O(N), SC: O(N).

public class sumArrayElts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter length of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution3 solution = new Solution3();
        System.out.println("The sum of the elements of the given array is: " + solution.arraySum(arr));
        sc.close();
    }

}
