package OOPsBasics;

class Test {
    public static void printTest() {
        System.out.println("Hello! Static Method!");
    }

    public void printTest2() {
        System.out.println("Hello! Non static method using object!");
    }

}

public class classesObjectsandStaticMethods {
    public static void main(String[] args) {
        Test.printTest(); // accessing static method printTest() of Test Class without needing object i.e.
                          // without creating instance of class.

        Test test = new Test(); // creating object called 'test' of Test Class.
        test.printTest2(); // accessing non static method of Test Class using object.
    }
}
