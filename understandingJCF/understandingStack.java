package understandingJCF;

import java.util.*;

public class understandingStack {
    public static void main(String[] args) {
        // LIFO: Last In, First Out.
        // Stores elements in a way that the last element entered is the first element
        // deleted.
        // Stack is a class

        // Declaring a stack
        Stack<Integer> st = new Stack<>();
        // Adding elements in the stack
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        // Printing
        System.out.println(st);
        // To get the last element entered
        System.out.println("The element entered in the stack was: " + st.peek());
        // To access 2nd last, 3rd last and so on elements:
        while (st.isEmpty() == false) // isEmpty() returns true if stack is empty. else, it returns false.
        {
            System.out.println(st.peek());
            st.pop(); // deletes last element from the stack
        }

    }
}
