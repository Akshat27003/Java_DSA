package basicArrays;

import java.util.Scanner;

/*
Given an array arr of size n, the task is to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order. 
If the array is sorted then return True, else return False.

Examples:
(1)
Input: n = 5, arr = [1,2,3,4,5]
Output: True
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
(2)
Input: n = 5, arr = [5,4,6,7,8]
Output: False
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False. Here element 5 is not smaller than or equal to its future elements.
(3)
Input: n = 5, arr = [5,4,3,2,1]
Output:
False
 */

class Solution3 {
    public boolean checkArraySort(int[] arr, int size) {
        for (int i = 0; i < (size - 1); i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
// TC: O(N), SC: O(1).

public class checkIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements in the Array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Given Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Solution3 solution = new Solution3();

        if (solution.checkArraySort(arr, n)) {
            System.out.println("The Given Array is sorted.");
        } else {
            System.out.println("The Given Array is not sorted.");
        }

        sc.close();
    }
}
