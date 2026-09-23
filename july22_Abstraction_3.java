// Interface 



//  Car.java----------------------------------------------------
interface Car {
    int n = 444;
    void startEngine();
    void stopEngine();
    void device();
    void displayMileage();
}
//----------------------------------------------------------------------





// Ferrari.java----------------------------------------------------
class Ferrari implements Car {
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
//----------------------------------------------------------------------


//inheritence.java----------------------------------------------------
public class july22_Abstraction_3 {
    public static void main(String[] args) {
        Car c1 = new Ferrari();
        c1.startEngine();
        c1.stopEngine();
        c1.device();
        c1.displayMileage();
        Car.n = 32;         // Become Final, because by default Variable in interface is Public Static Final, so we can't change the value of n
    System.out.println(Car.n);
    }
}
//----------------------------------------------------------------------