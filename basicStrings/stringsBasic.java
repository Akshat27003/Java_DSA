package basicStrings;

import java.lang.String;

public class stringsBasic {
    public static void main(String[] args) {
        // String is a class
        // It represents a sequence of characters.
        // It is immutable: on modifying, new object is created to which str points on
        // assigning.
        // String literals are stored in a special area
        // of memory called string pool.
        // Writing string literals:
        String str = "Hello";
        System.out.println(str);
        // objects of string class are stored in heap memory.
        // creating object of String class.
        String str2 = new String("Hello");
        System.out.println(str2);
        String str3 = "Hello"; // checks if "Hello" is there in string pool.
        System.out.println(str3);
        // if "Hello" is there in string pool, str3 points to that same reference.
        String str4 = new String("Hello");
        System.out.println(str4);
        // creates a different and new object in Heap Memory and stores "Hello".
        String str5 = new String("Hell");
        System.out.println(str5);
        // creates a different and new object in Heap Memory and stores "Hell".

        // == checks if 2 variables / objects are referencing the same memory.
        // equals() checks the content of 2 strings.
        System.err.println(str == str2); // false
        System.out.println(str == str3); // true
        System.out.println(str == str4); // false
        System.out.println(str == str5); // false
        System.out.println(str2 == str3); // false
        System.out.println(str2 == str4); // false
        System.out.println(str2 == str5); // false
        System.out.println(str3 == str4); // false
        System.out.println(str3 == str5); // false
        System.out.println(str4 == str5); // false
        System.out.println();
        System.out.println(str.equals(str2)); // true
        System.out.println(str.equals(str3)); // true
        System.out.println(str.equals(str4)); // true
        System.out.println(str.equals(str5)); // false
        System.out.println(str2.equals(str3)); // true
        System.out.println(str2.equals(str4)); // true
        System.out.println(str2.equals(str5)); // false
        System.out.println(str3.equals(str4)); // true
        System.out.println(str3.equals(str5)); // false
        System.out.println(str4.equals(str5)); // false

        // length of string.
        System.out.println("The length of string str is: " + str.length());

        // substring(startIndex,endIndex+1) -> gives string from startIndex to endIndex.
        System.out.println(str.substring(2, 4));
        // substring(startIndex) -> print everything from startIndex.
        System.out.println(str.substring(2));

        // concatenation.
        str = str + " " + str5;
        System.out.println(str);
    }
}
