package understandingJCF;

import java.util.*;

public class understandingInterface {
    public static void main(String[] args) {
        // Iterator allows us to traverse through a collection.
        // ListIterator is a special iterator for traversing through a List.

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(2);

        // Iterating through the ArrayList using for each loop
        for (var i : al) {
            System.out.println(i);
        }

        System.out.println();

        // Iterating using Iterator:
        Iterator<Integer> iterator = al.iterator();
        // Iterator is an interface.
        // Iterator<Integer> -> it will iterate over a collection (ArrayList) of Integer
        // elements.
        // It is implemented in the class using it.
        // al.iterator() -> calls the iterator() method on collection ArrayList 'al'.
        // 'iterator' is an reference variable of type Iterator<Integer>.
        // iterator is initially just before 1st element.
        while (iterator.hasNext()) // true if an element is there in the collection to traverse.
        {
            Integer num = iterator.next(); // first, move the iterator to 1st element.
            // then, move iterator to next element every time till there are elements left.
            System.out.println(num);
        }

    }
}
