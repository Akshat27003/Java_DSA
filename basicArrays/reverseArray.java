package basicArrays;

import java.util.Scanner;

/*
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

Examples:
(1)
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
(2)
Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]
Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1].
(3)
Input: n=3, arr = [1,2,1]
Output:
[1,2,1]
 */

class Solution4 {
    public void reverseArrayElts(int[] arr, int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
// TC: O(N), SC: O(1).

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements in the Array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Given Array before reversal is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Solution4 solution = new Solution4();

        solution.reverseArrayElts(arr, n);

        System.out.println("The Given Array after reversal is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
