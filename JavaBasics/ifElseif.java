package JavaBasics;

import java.util.Scanner;

public class ifElseif {

    public static void main(String[] args) {

        /*
         * Given marks of a student, print on the screen:
         * Grade A if marks >= 90
         * Grade B if marks >= 70
         * Grade C if marks >= 50
         * Grade D if marks >= 35
         * Fail, otherwise.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the student: ");
        int marks = sc.nextInt();

        // implementing if - else if - else block and multiple conditions.
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }

}