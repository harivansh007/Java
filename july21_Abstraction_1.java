// Upcasting and Downcasting in Java

abstract class Car {

    public abstract void startEngine();

    public abstract void run();

    public abstract void device();

    public abstract void turnOffEngine();
}


// Child class
class BMW extends Car {

    @Override
    public void startEngine() {
        System.out.println("BMW can start with key only.");
    }

    @Override
    public void run() {
        System.out.println("This BMW can run with 200 km/h.");
    }

    @Override
    public void device() {
        System.out.println("We have ADVANCED FM Radio and Bluetooth functionality.");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("BMW's engine can turn off with Push Button.");
    }
}


// Child class
class Swift extends Car {

    @Override
    public void startEngine() {
        System.out.println("Swift can start with key only.");
    }

    @Override
    public void run() {
        System.out.println("This Swift can run with 150 km/h.");
    }

    @Override
    public void device() {
        System.out.println("We have FM Radio and Bluetooth functionality.");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Swift's engine can turn off with key only.");
    }
}


public class july21_Abstraction_1 {

    public static void main(String[] args) {

        System.out.println("\n================ UPCASTING ================\n");

        // Upcasting
        // Child object -> Parent reference

        Car b8 = new BMW();

        b8.startEngine();
        b8.run();
        b8.device();
        b8.turnOffEngine();


        System.out.println("\n-------------------------------------------\n");


        // Upcasting
        // Child object -> Parent reference

        Car s1 = new Swift();

        s1.startEngine();
        s1.run();
        s1.device();
        s1.turnOffEngine();


        System.out.println("\n================ DOWNCASTING ================\n");


        // Downcasting
        // Parent reference -> Child reference

        BMW b2 = (BMW) b8;

        b2.startEngine();
        b2.run();
        b2.device();
        b2.turnOffEngine();


        System.out.println("\n-------------------------------------------\n");


        // Downcasting
        // Parent reference -> Child reference

        Swift s2 = (Swift) s1;

        s2.startEngine();
        s2.run();
        s2.device();
        s2.turnOffEngine();
    }
}