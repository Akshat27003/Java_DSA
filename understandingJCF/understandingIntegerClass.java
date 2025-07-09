package understandingJCF;

public class understandingIntegerClass {
    public static void main(String[] args) {
        // Integer: wrapper class for primitive data type int.
        // belongs to java.lang package
        // It wraps a primitive int value to an object.
        // It is needed as Java collections can only store objects and not primitive
        // data type.
        // It provides useful methods for Integer like parseInt().
        int num = 5;
        Integer obj = Integer.valueOf(num);
        System.out.println(obj); // prints 5 as obj contains 5.
        // parseInt() -> static method of class Integer.
        // converts a string into primitive int.
        // if a string can not be converted to int, it throws:
        // NumberFormatException.
        String str = "12";
        int num2 = Integer.parseInt(str);
        System.out.println(num2); // prints 12 as num2 contains 12.
        int num3 = Integer.parseInt(str + 10); // concatenates 12 and treats 10 as String
        // 12 + 10 => becomes 1210
        System.out.println(num3); // prints 1210.
        int num4 = Integer.parseInt(str) + 10;
        // convert str to int and add 10 to int val.
        System.out.println(num4); // prints 22.

        // Autoboxing: Java automatically converts int and Integer whenever needed.
    }
}
