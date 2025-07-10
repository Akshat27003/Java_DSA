package basicMath;

import java.util.*;

/*
You are given an integer n. You need to find all the divisors of n. 
Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called it's divisor.

Examples:
(1)
Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.
(2)
Input: n = 8
Output: [1, 2, 4, 8]
Explanation: The divisors of 8 are 1, 2, 4, 8.
(3)
Input: n = 7
Output:
[1, 7]
 */

class Solution6 {
    public ArrayList<Integer> returnAllDivisorsOfN(int num) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; (i * i) <= num; i++) {
            if (num % i == 0) {
                al.add(i);
                if (i != (num / i)) {
                    al.add((num / i));
                }
            }
        }
        Collections.sort(al);
        return al;
    }
}
// TC: O(sqrt(N)) + O(K*log2(K)), SC: O(sqrt(N)).
// A number can have at most 2*sqrt(N) divisors
// which would be the size of container in worst case.
// O(K*log2(K)) -> Complexity of Sort() algorithm
// K is the number of divisors (in the container).

public class returnAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution6 solution6 = new Solution6();
        ArrayList<Integer> answer = new ArrayList<>();
        answer = solution6.returnAllDivisorsOfN(n);
        System.out.println(answer);
        sc.close();
    }
}
