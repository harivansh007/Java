// Interface 



//  Car.java----------------------------------------------------
interface Car {
    public static final String BRAND_NAME = "TOYOTA";  // Constant variable will be in CAPITAL with UNDERSCORE   [CAPITAL+SNAKE_CASE]
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
public class july22_Abstraction_4 {
    public static void main(String[] args) {
        Car c1 = new Ferrari();
        c1.startEngine();
        c1.stopEngine();
        c1.device();
        c1.displayMileage();
        System.out.println("Car Brand: " + Car.BRAND_NAME);
      }
}
//----------------------------------------------------------------------