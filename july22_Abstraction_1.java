// Abstract Class definition
abstract class Car {
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void device();
    public abstract void displayMileage();
}

// Subclass providing concrete implementation
class Ferrari extends Car {
    @Override
    public void startEngine() {
        System.out.println("Ferrari V8 engine started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public void device() {
        System.out.println("Ferrari infotainment system active.");
    }

    @Override
    public void displayMileage() {
        // High-performance sports cars like a Ferrari typically get around 12–15 MPG (miles per gallon).
        System.out.println("Estimated Mileage: 14 MPG");
    }
}

public class july22_Abstraction_1 {
    public static void main(String[] args) {
        Car c1 = new Ferrari();
        c1.startEngine();
        c1.stopEngine();
        c1.device();
        c1.displayMileage();
    }
}