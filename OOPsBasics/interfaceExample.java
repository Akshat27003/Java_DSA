package OOPsBasics;

//declaring an interface. 
// interfaces are another way of implementing abstraction.
interface Animal3 {
    void bark(); // abstract method by default. we dont need to write abstract separately.

    // default method implementation comes in use when the class implementing
    // interface
    // does not override the default method.
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    // static methods of abstract class or interfaces can be directly accessed
    // using the class without needing object.
    static void walk() {
        System.out.println("Walking");
    }
}

// like extends for classes, implements is used with interfaces being
// implemented in classes.
class Dog3 implements Animal3 {
    // implementing the method declared in Animal3 interface.
    public void bark() {
        System.out.println("Dog Bark!!!");
    }

    // overriding the sleep method of Animal3 interface.
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat3 implements Animal3 {
    // implementing the method declared in Animal3 interface.
    public void bark() {
        System.out.println("Cat Meow!!!");
    }

    // default method not overriden here.
}

public class interfaceExample {
    public static void main(String[] args) {
        Animal3.walk(); // accessing static method of interface directly.
        Animal3 dog = new Dog3(); // object of Dog3 class. Reference variable of Animal3 interface type.
        dog.bark(); // method implemented in Dog3 Class implemented.
        dog.sleep(); // overriden method of Dog3 class would be implemented.
        Animal3 cat = new Cat3(); // object of Cat3 class. Reference variable of Animal3 interface type.
        cat.bark(); // method implemented in Cat3 class implemented.
        cat.sleep(); // default method of Animal interface implemented.
    }
}
