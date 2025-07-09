package understandingJCF;

import java.util.*;

public class understandingCustomComparator {
    public static void main(String[] args) {
        // Comparator is an interface
        // it is a functional interface
        // it has one abstract method, compare.
        // we need to implement compare ourselves.

        // we can use lambda expression to save time but writing comparator logic is a
        // good practice.
        // lambda expressions are a concise way to write functional interface quickly
        // in 1 line, for one time use maybe.

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(0);
        al.add(6);
        al.add(-4);
        al.add(3);
        al.add(7);
        System.out.println(al);
        // writing custom comparator for sorting ArrayList in descending order:
        Collections.sort(al, new Comparator<Integer>() { // new object using anonymous class.
            // anonymous class is a class without name defined and instantiated in a single
            // expression.
            // new Comparator<Integer>() -> object of anonymous class
            // implementing abstract method compare()
            // of interface Comparator.
            @Override
            public int compare(Integer num1, Integer num2) { // abstract method of Comparator interface.
                if (num1 < num2) {
                    return 1;
                } else if (num1 > num2) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(al);
    }
}
