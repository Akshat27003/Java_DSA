package Arrays;

import java.util.*;

/*
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. 
The elements in the union must be in ascending order.



The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.


Examples:
(1)
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
(2)
Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
Output: [1, 3, 4, 5, 6, 7, 8, 9]
Explanation: The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2
(3)
Input: nums1 = [3, 4, 4, 4], nums2 = [6, 7, 7]
Output:
[3, 4, 6, 7]

Constraints:
1 <= nums1.length, nums2.length <= 1000
-10^4 <= nums1[i] , nums2[i] <= 10^4
Both nums1 and nums2 are sorted in non-decreasing order

 */

class Solution12 {
    public int[] unionBrute(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n1; i++) {
            ts.add(nums1[i]);
        }
        for (int i = 0; i < n2; i++) {
            ts.add(nums2[i]);
        }
        int[] unionArr = new int[ts.size()];
        int index = 0;
        for (var i : ts) {
            unionArr[index++] = i;
        }
        return unionArr;
    }
    // TC: O(n1logn) + O(n2logn) + O(n1 + n2).
    // SC: O(n1 + n2) + O(n1 + n2).

    public int[] unionOptimal(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                if (al.isEmpty() || al.get(al.size() - 1) != nums1[i]) {
                    al.add(nums1[i]);
                }
                i++;
            } else {
                if (al.isEmpty() || al.get(al.size() - 1) != nums2[j]) {
                    al.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (al.isEmpty() || al.get(al.size() - 1) != nums1[i]) {
                al.add(nums1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (al.isEmpty() || al.get(al.size() - 1) != nums2[j]) { // al.get(al.size()-1) -> gives last element.
                al.add(nums2[j]);
            }
            j++;
        }

        int[] unionArr = new int[al.size()];
        int index = 0;
        for (var itr : al) {
            unionArr[index++] = itr;
        }
        return unionArr;
    }
    // TC: O(n1+n2) + O(n1+n2). If we directly return ArrayList then it will be just
    // O(n1+n2)
    // SC: O(n1+n2) + O(n1+n2). If we directly return ArrayList then it will be just
    // O(n1+n2)
}

public class unionOfSortedArrays {
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
        Solution12 solution = new Solution12();
        int[] answer = solution.unionBrute(nums1, nums2);
        int[] answer2 = solution.unionOptimal(nums1, nums2);
        System.out.println("The Union Of the 2 Arrays using Brute Method is: ");
        for (var i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The Union Of the 2 Arrays using Optimal Method is: ");
        for (var i : answer2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
