package understandingJCF;

import java.util.*; // imports everything.
// important if we want to use Java Collections Framework.

// ArrayList is a class
// it implements list which itself extends to Collections.
// 0 based indexing is there in ArrayList.
// quite similar to arrays.
// Dynamic in nature, dynamic size.

public class understandingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>(); // declaring an ArrayList.
        System.out.println("The current size of the ArrayList is: " + aList.size()); // returns the size of ArrayList.
        // adding elements to an ArrayList
        aList.add(10);
        aList.add(16);
        aList.add(20);
        // Printing an ArrayList directly
        System.out.println(aList);
        System.out.println("The current size of the ArrayList is: " + aList.size());
        // To get element at particular index:
        // if we try to get an element at an index which is not there in ArrayList
        // it gives Index OutOfBound exception.
        System.out.println("The element at index 1 is: " + aList.get(1));
        // To remove element from a particular index:
        int elt = aList.remove(1);
        System.out.println("The element removed is: " + elt);
        System.out.println(aList);
        // To add at particular index, use overloaded add() method.
        aList.add(1, 16);
        // adding element at the end takes constant time.
        // adding at particular index takes a lot of time.
        System.out.println(aList);
        // to check if a particular element is in the ArrayList or not.
        System.out.println("17 is present in list: " + aList.contains(17));
        System.out.println("16 is present in list: " + aList.contains(16));
        // Printing using for each loop
        for (int i : aList) {
            System.out.println(i);
        }

        // Vector:
        // It is a class and it is very similar to ArrayList
        // in terms of methods.
        // Vector is thread safe.
        // Used mostly in industries.
        // Syntax:
        // Vector<Integer> v = new Vector<>();
    }
}
