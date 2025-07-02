package JavaBasics;

import java.util.Scanner;

public class sumFirstLastEltArray {

    // given an integer array, print the sum of the first and last element of the
    // array.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();

        // declaring an array so size specified by user:
        int[] arr = new int[size];

        // input elements in array by user.
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index: " + i);
            arr[i] = sc.nextInt();
        }

        // printing elements of array.
        System.out.print("The Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int sum = arr[0] + arr[size - 1]; // sum of first and last elt.
        System.out.println("The sum of first and last element of the given array is: " + sum);

        sc.close();
    }
}
