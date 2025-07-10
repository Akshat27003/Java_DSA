package basicMath;

import java.util.Scanner;

class Solution10 {
    public boolean checkPrime(int num) {
        // edge case
        if (num == 1) {
            return false;
        }
        for (int i = 2; (i * i) <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// TC: O(sqrt(N)), SC: O(1).

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Solution10 solution10 = new Solution10();
        if (solution10.checkPrime(n)) {
            System.out.println("The given number is a PRIME NUMBER.");

        } else {
            System.out.println("The given number is NOT a PRIME NUMBER.");

        }
        sc.close();
    }
}
