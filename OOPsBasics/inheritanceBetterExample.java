package OOPsBasics;

class Vehicle2 {
    private String vehicleNo;

    public Vehicle2(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public void getVehicleNo() {
        System.out.println("The vehicle number is: " + vehicleNo);
    }

    public void honk() {
        System.out.println("Honkk!");
    }
}

class Car2 extends Vehicle2 {
    public Car2(String carNo) {
        // super is used to pass to base class.
        super(carNo); // carNo passed to constructor of Vehicle2 as vehicleNo.
    }
}

class Bus2 extends Vehicle2 {
    public Bus2(String busNo) {
        // super is used to pass to base class.
        super(busNo); // busNo passed to constructor of Vehicle2 as vehicleNo.
    }
}

public class inheritanceBetterExample {
    public static void main(String[] args) {
        Car2 car = new Car2("CH01AB0000");
        car.getVehicleNo();
        car.honk();

        Bus2 bus = new Bus2("CH01AB1111");
        bus.getVehicleNo();
        bus.honk();
    }
}
