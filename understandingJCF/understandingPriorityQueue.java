package understandingJCF;

import java.util.PriorityQueue;

public class understandingPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue Class
        // It implements Queue interface
        // Underlying data structure is Tree
        // Also known as Min Heap (Min Priority Queue)

        // Declaration:
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Adding elements:
        pq.offer(1);
        pq.offer(0);
        pq.offer(5);
        pq.offer(4);
        pq.offer(2);
        // Printing:
        System.out.println(pq); // random order of printing
        // peek() -> returns smallest element.
        System.out.println("The smallest element in PriorityQueue is: " + pq.peek());
        // poll() -> removes smallest element.
        int val = pq.poll();
        System.out.println("The removed element is: " + val);
        System.out.println(pq);
        // Printing PriorityQueue using for each loop.
        for (var num : pq) {
            System.out.println(num);
        }
        System.out.println();
        // Printing PriorityQueue in ascending order:
        while (pq.isEmpty() == false) // isEmpty() returns true if PriorityQueue is empty. Else, false.
        {
            System.out.println(pq.peek());
            pq.poll();
        }

        // Custom comparators allows us to store element
        // and return the largest element on using peek().
        // This is called Max Priority Queue (or Max Heap)
    }
}
