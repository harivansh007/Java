
class Engine {
    private int hp;
    private int torque;

    public Engine(int hp, int torque) {
        this.hp = hp;
        this.torque = torque;
        System.out.println("Engine.Engine()");
    }

    @Override
    public String toString() {
        return "Engine [hp=" + hp + ", torque=" + torque + "]";
    }
}

class Driver {
    private String driverName;
    private String city;

    public Driver(String driverName, String city) {
        this.driverName = driverName;
        this.city = city;
        System.out.println("Driver.Driver()");
    }

    @Override
    public String toString() {
        return "Driver [driverName=" + driverName + ", city=" + city + "]";
    }
}

class Car {
    private String name;
    private Driver driver;
    private final Engine engine;

    public Car() {
        engine = new Engine(3635, 9898);
        System.out.println("Car.Car()");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", driver=" + driver + ", engine=" + engine + "]";
    }
}

public class july29_1 {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setDriver(new Driver("Rahul", "Delhi"));

        System.out.println(car1);
    }
}
