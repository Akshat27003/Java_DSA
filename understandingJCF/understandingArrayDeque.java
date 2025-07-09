package understandingJCF;

import java.util.ArrayDeque; // importin ArrayDeque specifically.

public class understandingArrayDeque {
    public static void main(String[] args) {
        // Class implementing Deque interface which extends to Queue Interface
        // Queue uses FIFO : First In First Out for storing elements.
        // It can add from the front and end as it implements Deque as well which is
        // doubly ended (2 ended).

        // Declaring ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // Adding elements to ArrayDeque (at the end):
        ad.offer(2);
        ad.offer(6);
        ad.offer(9);
        ad.offer(10);
        // Printing:
        System.out.println(ad);
        // To return first element of ArrayDeque:
        System.out.println("The first element of ArrayDeque ad is: " + ad.peek());
        // To delete first element from ArrayDeque:
        int val = ad.poll();
        System.out.println("The deleted element was: " + val);
        System.out.println(ad);
        // To add element exclusively at the start:
        ad.offerFirst(8);
        // To add element exclusively at the end:
        ad.offerLast(12);
        System.out.println(ad);
        // peekFirst() -> returns first element of ArrayDeque
        System.out.println("The first element of ArrayDeque is: " + ad.peekFirst());
        // peekLast() -> returns last element of ArrayDeque
        System.out.println("The last element of ArrayDeque is: " + ad.peekLast());
        // pollFirst() -> removes first element from ArrayDeque
        int val2 = ad.pollFirst();
        System.out.println("The element deleted was: " + val2);
        System.out.println(ad);
        // pollLast() -> removes last element from ArrayDeque
        int val3 = ad.pollLast();
        System.out.println("The element deleted was: " + val3);
        System.out.println(ad);
    }

}
