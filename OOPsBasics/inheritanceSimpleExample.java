package OOPsBasics;

//base class Vehicle
class Vehicle {
    public void honk() {
        System.out.println("Honkk!");
    }
}

// base class Vehicle inherited in derived class Car.
// the method honk() can be used by class Car.
class Car extends Vehicle {
    private String carNo;

    public Car(String carNo) {
        this.carNo = carNo;
    }

    public void getCarNo() {
        System.out.println("The car number is: " + carNo);
    }
}

// base class Vehicle inherited in derived class Bus.
// the method honk() can be used by class Bus.
class Bus extends Vehicle {
    private String busNo;

    public Bus(String busNo) {
        this.busNo = busNo;
    }

    public void getBusNo() {
        System.out.println("The car number is: " + busNo);
    }
}

public class inheritanceSimpleExample {

    public static void main(String[] args) {
        // creating object of derived class creates and allocates memory of base class
        // as well.
        Car car = new Car("CH01AB0000");
        car.getCarNo();
        car.honk(); // calling method of base class Vehicle using object of derived class.

        Bus bus = new Bus("CH01AB1111");
        bus.getBusNo();
        bus.honk(); // calling method of base class Vehicle using object of derived class.
    }
}
