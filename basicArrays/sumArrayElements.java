package basicArrays;

import java.util.Scanner;

/*
Given an array arr of size n, the task is to find the sum of all the elements in the array.


Examples:
(1)
Input: n=5, arr = [1,2,3,4,5]
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15
(2)
Input: n=6, arr = [1,2,1,1,5,1]
Output: 11
Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
(3)
Input: n=3, arr = [2,1,1]
Output:
4
 */

class Solution {
    public int sumOfElementsOfArray(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
// TC: O(N), SC:O(1).

public class sumArrayElements {

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

        Solution solution = new Solution();
        System.out.println("The sum of all Elements of the given array is: " + solution.sumOfElementsOfArray(arr, n));
        sc.close();
    }

}
