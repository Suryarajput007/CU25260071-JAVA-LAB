// Question 18: Vehicle → Car → ElectricCar + Electric
package question18;

// Vehicle
//    ↓
//   Car        Electric (interface)
//     \        /
//     ElectricCar      (extends Car, implements Electric)
class Vehicle { void start() { System.out.println("Vehicle started."); } }
class Car extends Vehicle { void drive() { System.out.println("Car is driving."); } }
interface Electric { void chargeBattery(); }

class ElectricCar extends Car implements Electric {
    @Override public void chargeBattery() { System.out.println("ElectricCar battery charging."); }
}

public class Question18 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.chargeBattery();
    }
}
