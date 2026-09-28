// Question 9: Vehicle → Car → ElectricCar
package question9;

// Vehicle -> Car -> ElectricCar
class Vehicle {
    void start() { System.out.println("Vehicle started."); }
    void stop()  { System.out.println("Vehicle stopped."); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car is being driven."); }
}
class ElectricCar extends Car {
    void chargeBattery() { System.out.println("Electric car battery is charging."); }
}

public class Question9 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();          // Vehicle
        ec.drive();          // Car
        ec.chargeBattery();  // ElectricCar
        ec.stop();           // Vehicle
    }
}
