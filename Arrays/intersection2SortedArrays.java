package Arrays;

import java.util.*;

/*
Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays. 
Each element in the result must appear as many times as it appears in both arrays.



The intersection of two arrays is an array where all values are present in both arrays.


Examples:
(1)
Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]
Output: [1, 2]
Explanation: The elements 1, 2 are the only elements present in both nums1 and nums2
(2)
Input: nums1 = [1, 2, 2, 3], nums2 = [4, 5, 7]
Output: []
Explanation: No elements appear in both nums1 and nums2
(3)
Input: nums1 = [-45, -45, 0, 0, 2], nums2 = [-50, -45, 0, 0, 5, 7]
Output:
[-45, 0, 0]

Constraints:
1 <= nums1.length, nums2.length <= 1000
-10^4 <= nums1[i], nums2[i] <= 10^4
Both nums1 and nums2 are sorted in non-decreasing order.



 */

class Solution13 {
    public int[] intersectionBrute(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] visited = new int[n2];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j] && visited[j] != 1) {
                    al.add(nums1[i]);
                    visited[j] = 1;
                    break;
                }
                if (nums2[j] > nums1[i]) {
                    break;
                }
            }
        }
        int[] intersection = new int[al.size()];
        int index = 0;
        for (var itr : al) {
            intersection[index++] = itr;
        }
        return intersection;
    }
    // TC: O(N1*N2) + O(N).
    // SC: O(N2) + O(N) + O(N).

    public int[] intersectionOptimal(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> al2 = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                al2.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] intersection2 = new int[al2.size()];
        int index = 0;
        for (var itr2 : al2) {
            intersection2[index++] = itr2;
        }
        return intersection2;
    }
    // TC: O(N1 + N2)
    // SC: O(N1 + N2)
}

public class intersection2SortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Enter size of array 1: ");
        n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("The 1st Array is: ");
        for (var i : nums1) {
            System.out.print(i + " ");
        }
        System.out.println();
        int n2;
        System.out.println("Enter size of array 2: ");
        n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of array 2: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println("The 2nd Array is: ");
        for (var i : nums2) {
            System.out.print(i + " ");
        }
        System.out.println();
        Solution13 solution = new Solution13();
        int[] answer = solution.intersectionBrute(nums1, nums2);
        int[] answer2 = solution.intersectionOptimal(nums1, nums2);
        System.out.println("The Intersection Of the 2 Arrays using Brute Method is: ");
        for (var i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The Intersection Of the 2 Arrays using Optimal Method is: ");
        for (var i : answer2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
