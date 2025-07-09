package understandingJCF;

import java.util.*;

public class understandingLinkedList {
    public static void main(String[] args) {
        // LinkedList is a class implementing List interface and Deque interface.
        // List interface extends to Collections interface.
        // Dynamic in nature
        // Allows us to add from end and front.

        // Declaring LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        // Adding elements to LinkedList (at the end)
        ll.add(2);
        // Adding elements at the front.
        ll.addFirst(3);
        // Adding elements exclusively at the end.
        ll.addLast(4);
        // Printing
        System.out.println(ll);
        // To remove element from the front.
        int elt = ll.removeFirst();
        System.out.println("The first element of the LinkedList is: " + elt);
        System.out.println(ll);
        // To remove element from the end.
        int elt2 = ll.removeLast();
        System.out.println("The last element of the LinkedList is: " + elt2);
        System.out.println(ll);
        ll.add(5);
        ll.add(6);
        ll.add(1);
        System.out.println(ll);
        // To access element at the start.
        System.out.println("The element at the start is: " + ll.getFirst());
        // To access eleement at the end.
        System.out.println("The element at the end is: " + ll.getLast());
    }
}
