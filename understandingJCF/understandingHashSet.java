package understandingJCF;

import java.util.*;

public class understandingHashSet {
    public static void main(String[] args) {
        // HashSet is a Class
        // It implements Set interface.
        // Indexing is not there.
        // HashSet Data Structure stores elements in random order.
        // It stores unique elements only.
        // TC: O(1).

        // Declaring HashSet
        HashSet<Integer> hs = new HashSet<>();
        // Adding elements to HashSet
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(3);
        hs.add(0);
        // Printing:
        System.out.println(hs);
        // Iterating through individual values of HashSet
        // Using For Each Loop
        for (Integer num : hs) {
            System.out.println(num);
        }

        System.out.println();
        // for each loop using 'var'
        // var takes the value type corresponding to the data in hs by itself.
        // for hs, var will be Integer.
        // similar to auto
        for (var num2 : hs) {
            System.out.println(num2);
        }
    }
}
