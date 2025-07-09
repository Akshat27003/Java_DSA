package understandingJCF;

import java.util.*;

public class understandingTreeMap {
    public static void main(String[] args) {
        // Class implementing Map interface
        // Sorted order of keys.
        // Stores key value pairs.
        // TC: O(log N)
        // No duplicate keys. Only unique.
        // Better to use HashMap when sorting is not needed.
        // HashMap takes lesser time.

        // Declaration
        TreeMap<Integer, String> tmap = new TreeMap<>();

        // Adding Key Value
        tmap.put(1, "ABC");
        tmap.put(2, "BCD");
        tmap.put(3, "CDE");

        // Printing:
        System.out.println(tmap);

        // ceilingKey() -> returns first key >= given key
        int key = tmap.ceilingKey(3);
        int key2 = tmap.ceilingKey(0);
        System.out.println(key); // prints 3
        System.out.println(key2); // prints 1
        // floorKey() -> returns first key <= given key
        int key3 = tmap.floorKey(3);
        int key4 = tmap.floorKey(4);
        System.out.println(key3); // prints 3
        System.out.println(key4); // prints 3
        // keySet() -> returns all the keys of the TreeMap in the form of a set
        Set<Integer> st = tmap.keySet();
        System.out.println(st);
    }
}
