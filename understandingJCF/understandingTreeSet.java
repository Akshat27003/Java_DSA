package understandingJCF;

import java.util.*;

public class understandingTreeSet {
    public static void main(String[] args) {
        // class, implements Set interface
        // stores element in sorted order.
        // more time than HashSet
        // TC: O(log N).
        // use HashSet always when sorting not needed.

        // Declaring TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        // adding to TreeSet
        ts.add(45);
        ts.add(4);
        ts.add(-1);
        ts.add(5);
        // Printing:
        System.out.println(ts);
        // Iterating using for each loop:
        for (var num : ts) {
            System.out.println(num);
        }
        // floor() -> returns first value <= given num.
        System.out.println(ts.floor(4)); // prints 4.
        System.out.println(ts.floor(7)); // prints 5
        System.out.println(ts.floor(-2)); // returns null as no such val exists.
        // ceiling() -> returns first value >= given num.
        System.out.println(ts.ceiling(4)); // prints 4.
        System.out.println(ts.ceiling(7)); // prints 45.
        System.out.println(ts.ceiling(46)); // returns null as no such val exists.
    }
}
