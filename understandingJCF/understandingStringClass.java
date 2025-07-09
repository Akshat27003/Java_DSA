package understandingJCF;

public class understandingStringClass {

    public static void main(String[] args) {
        // String is a class
        // It represents a sequence of characters.
        // It is immutable.
        // String literals are stored in a special area
        // of memory called string pool.
        // Writing string literals:
        String str = "Hello";
        // objects of string class are stored in heap memory.
        // creating object of String class.
        String str2 = new String("Hello");
        String str3 = "Hello"; // checks if "Hello" is there in string pool.
        // if "Hello" is there in string pool, str3 points to that same reference.
        String str4 = new String("Hello");
        // creates a different and new object in Heap Memory and stores "Hello".
        String str5 = new String("Hell");
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

    }

}
