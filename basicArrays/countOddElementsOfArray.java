package basicArrays;

import java.util.Scanner;

/*
Given an array of n elements. The task is to return the count of the number of odd numbers in the array.


Examples:
(1)
Input: n=5, array = [1,2,3,4,5]
Output: 3
Explanation: The three odd elements are (1,3,5).
(2)
Input: n=6, array = [1,2,1,1,5,1]
Output: 5
Explanation: The five odd elements are one 5 and four 1's.
(3)
Input: n=5, array = [1,3,5,7,9]
Output:
5
 */

class Solution2 {
    public int getOddElements(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
// TC: O(N), SC: O(1).

public class countOddElementsOfArray {
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

        System.out.println("The Given Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Solution2 solution = new Solution2();
        System.out.println("The number of Odd Elements in the Given Array is: " + solution.getOddElements(arr, n));

        sc.close();
    }
}
