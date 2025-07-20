package recursionBasics;

import java.util.*;

/*

 */

class Solution2 {
    public long fact(int n) {
        if (n <= 1) // base condition
        {
            return 1;
        }
        return n * fact(n - 1);
    }
}
// TC: O(N), SC: O(N)

public class factorialN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: (from 1 to 15): ");
        n = sc.nextInt();
        Solution2 solution = new Solution2();
        System.out.println("The factorial of the given number is: " + solution.fact(n));
        sc.close();
    }

}
