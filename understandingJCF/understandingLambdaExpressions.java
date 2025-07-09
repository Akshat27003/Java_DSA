package understandingJCF;

import java.util.ArrayList;
import java.util.Collections;

public class understandingLambdaExpressions {
    public static void main(String[] args) {
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
        // writing custom comparator for sorting ArrayList in descending order
        // using lambda expressions
        // for lambda expressions, object created at runtime.
        // it is lightweight and efficient.
        // it is easier.
        // we can use lambda expressions when we want to save time.
        Collections.sort(al, (num1, num2) -> (num2 - num1));
        // (num1,num2) -> (num2 - num1) is anonymously implementing compare method
        // of interface Comparator and
        // using it directly with sort.
        System.out.println(al);
    }
}
