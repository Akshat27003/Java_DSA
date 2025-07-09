package understandingJCF;

import java.util.*;

public class usingCommonAlgorithms {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(0);
        al.add(9);
        al.add(8);
        al.add(3);
        al.add(3);
        System.out.println(al);
        Collections.sort(al); // sorts the ArrayList in ascending order
        // modifies the original ArrayList
        System.out.println(al);
        int maxElt = Collections.max(al); // returns largest element
        int minElt = Collections.min(al); // returns smallest element
        System.out.println("The largest element in ArrayList is: " + maxElt);
        System.out.println(("The smallest element in ArrayList is: " + minElt));
        Collections.reverse(al); // reverses the ArrayList
        // modifies the original ArrayList
        System.out.println(al);
        int freq = Collections.frequency(al, 3); // returns how many times 3 occurs in al.
        System.out.println("3 occurs " + freq + " times in the ArrayList.");
        // Collections.binarySearch(al,3) -> returns index of element (3 here) if
        // present in al.
        // else, returns negative value.
        // works for sorted Collections.
        // TC: O(log N).
        Collections.sort(al);
        System.out.println("3 is in ArrayList: " + Collections.binarySearch(al, 3));
        System.out.println("15 is in ArrayList: " + Collections.binarySearch(al, 15));

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 1;
        for (var i : arr) {
            System.out.println(i);
        }
        System.out.println();
        Arrays.sort(arr); // sorting and Arrays.
        for (var i : arr) {
            System.out.println(i);
        }

        // Math.pow(x,y) -> returns x raised to power y in double form.
        int powerAlgo = (int) Math.pow(2, 9);
        System.out.println("2 raised to power 9 is: " + powerAlgo);

    }
}
