package understandingJCF;

import java.util.*;

public class comparatorAndMaxPriorityQueue {
    // method called getComparator().
    // returns object of type Comparator<Integer> i.e. a comparator that returns
    // Integer values.
    public static Comparator<Integer> getComparator() {
        // the following line return new Comparator<Integer>()
        // creates a new object of anonymous class that implements the abstract method
        // compare
        // of interface Comparator.
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // if wrong order, return positive.
                if (num1 < num2) {
                    return 1;
                    // if correct order, return negative or 0.
                } else if (num1 > num2) {
                    return -1;
                }
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        // We can use custom comparator
        // to create Max Priority Queue (Max Heap).
        // Max Priority Queue stores largest element at the top.

        // Syntax:
        PriorityQueue<Integer> pq = new PriorityQueue<>(getComparator());
        pq.add(2);
        pq.add(4);
        pq.add(3);
        pq.add(1);
        pq.add(5);
        System.out.println(pq);

        int val = pq.peek(); // gives largest element.
        System.out.println(val);

        pq.poll(); // removes largest element.
        System.out.println(pq);
    }
}
