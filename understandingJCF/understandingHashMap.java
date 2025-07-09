package understandingJCF;

import java.util.*;

public class understandingHashMap {
    public static void main(String[] args) {
        // It is a class
        // It implements Map interface.
        // Dynamic in nature.
        // Does not store in sorted order.
        // Stores unique key
        // Duplicate values for key is possible.
        // TC: O(1).

        // Declaration:
        HashMap<Integer, String> mp = new HashMap<>();

        // Adding Key - Value pair:
        mp.put(1, "Raj");
        mp.put(2, "Akshat");
        mp.put(3, "Sahil");
        // Printing:
        System.out.println(mp);
        mp.put(1, "Yama"); // if we repeat a key, the last entered value for the key is taken.
        System.out.println(mp);
        // To get a value corresponding to a key
        String val = mp.get(3);
        System.out.println(val);
        // To remove a particular key and its corresponding value:
        mp.remove(2); // returns null if no key matches to entered key.
        System.out.println(mp);

    }
}
