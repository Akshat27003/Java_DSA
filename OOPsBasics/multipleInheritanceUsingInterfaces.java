package OOPsBasics;

// first interface
interface Animal4 {
    void bark();

    void sleep();
}

// second interface
interface Pet {
    void ownerName();
}

// implementing both interfaces features in the following class.
class Dog5 implements Animal4, Pet {
    public void bark() {
        System.out.println("Dog is barking!!");
    }

    public void sleep() {
        System.out.println("Dog is Sleeping!!");
    }

    public void ownerName() {
        System.out.println("ABC XYZ!!");
    }

}

public class multipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Dog5 dog = new Dog5(); // object and reference variable of Dog5 class only.
        dog.bark();
        dog.sleep();
        dog.ownerName();

        Animal4 animal = new Dog5();
        animal.bark();
        animal.sleep();
        // animal.ownerName(); -> this is not defined for Animal4.
        // it can not be accessed using reference variable of Animal4 interface.

        Pet pet = new Dog5();
        pet.ownerName();
        // likewise, bark() and sleep() can not be accessed
        // using reference variable of Pet interface.
    }
}
