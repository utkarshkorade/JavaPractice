// Abstract class for general vehicle
abstract class Vehicle {
    public abstract void start(); // Abstract method

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class Car extending Vehicle
public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started with key.");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();  // Car started with key
        car.stop();   // Vehicle stopped
    }
}
