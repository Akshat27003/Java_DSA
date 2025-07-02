package OOPsBasics;

// polymorphism: overriding methods of base class in derived class.
// this is run time polymorphism.

class Vehicle3 {
    private String vehicleNo;

    public Vehicle3(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public void getVehicleNo() {
        System.out.println("The Vehicle No is: " + vehicleNo);
    }

    public void honk() {
        System.out.println("Vehicle Honk");
    }
}

class Car3 extends Vehicle3 {
    public Car3(String carNo) {
        super(carNo);
    }

    // overriding honk() method of base class.
    @Override
    public void honk() {
        System.out.println("Car Honk");
    }
}

public class polymorphismExample {
    public static void main(String[] args) {
        Car3 car = new Car3("CH01AB0000");
        car.getVehicleNo();
        car.honk(); // this will invoke honk() method implemented in derived class.

        Vehicle3 vehicle = new Vehicle3("CH01AB1111"); // object of base class.
        vehicle.getVehicleNo();
        vehicle.honk(); // this will invoke honk() method implemented in base class.
    }
}
