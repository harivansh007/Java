// VEHICLE homework Grandparent class - 3 abstract methods
abstract class Vehicle {
    abstract void start();
    abstract void stop();
    abstract void fuelType();
}

// Parent class - extends Vehicle, adds 2 more abstract methods
abstract class Car extends Vehicle {
    abstract void openDoor();
    abstract void closeDoor();
}

// Parent class - extends Vehicle, adds 2 more abstract methods
abstract class Bike extends Vehicle {
    abstract void kickStart();
    abstract void applyBrake();
}

// Child class - extends Car, must implement all 5 abstract methods (3 + 2)
class Audi extends Car {
    @Override
    void start() {
        System.out.println("Audi: Engine started.");
    }
    @Override
    void stop() {
        System.out.println("Audi: Engine stopped.");
    }
    @Override
    void fuelType() {
        System.out.println("Audi: Runs on Petrol/Diesel.");
    }
    @Override
    void openDoor() {
        System.out.println("Audi: Door opened.");
    }
    @Override
    void closeDoor() {
        System.out.println("Audi: Door closed.");
    }
}

// Child class - extends Bike, must implement all 5 abstract methods (3 + 2)
class Splendor extends Bike {
    @Override
    void start() {
        System.out.println("Splendor: Engine started.");
    }
    @Override
    void stop() {
        System.out.println("Splendor: Engine stopped.");
    }
    @Override
    void fuelType() {
        System.out.println("Splendor: Runs on Petrol.");
    }
    @Override
    void kickStart() {
        System.out.println("Splendor: Kick-started.");
    }
    @Override
    void applyBrake() {
        System.out.println("Splendor: Brake applied.");
    }
}

public class july21_Abstraction_3 {
    public static void main(String[] args) {

        // 4 objects of Audi
        Audi audi1 = new Audi();
        Audi audi2 = new Audi();
        Audi audi3 = new Audi();
        Audi audi4 = new Audi();

        // Each object calls all 5 methods (4 x 5 = 20 calls)
        audi1.start(); audi1.stop(); audi1.fuelType(); audi1.openDoor(); audi1.closeDoor();
        audi2.start(); audi2.stop(); audi2.fuelType(); audi2.openDoor(); audi2.closeDoor();
        audi3.start(); audi3.stop(); audi3.fuelType(); audi3.openDoor(); audi3.closeDoor();
        audi4.start(); audi4.stop(); audi4.fuelType(); audi4.openDoor(); audi4.closeDoor();

        // 4 objects of Splendor
        Splendor splendor1 = new Splendor();
        Splendor splendor2 = new Splendor();
        Splendor splendor3 = new Splendor();
        Splendor splendor4 = new Splendor();

        // Each object calls all 5 methods (4 x 5 = 20 calls)
        splendor1.start(); splendor1.stop(); splendor1.fuelType(); splendor1.kickStart(); splendor1.applyBrake();
        splendor2.start(); splendor2.stop(); splendor2.fuelType(); splendor2.kickStart(); splendor2.applyBrake();
        splendor3.start(); splendor3.stop(); splendor3.fuelType(); splendor3.kickStart(); splendor3.applyBrake();
        splendor4.start(); splendor4.stop(); splendor4.fuelType(); splendor4.kickStart(); splendor4.applyBrake();
    }
}