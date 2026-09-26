
class Engine {
    private int hp, torque;

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
    private String driverName, city;

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

class Carr {
    private String name;
    private Driver driver;
    private final Engine engine;

    public Carr() {
        engine = new Engine(3635, 9898);
        System.out.println("Carr.Carr()");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Carr [name=" + name + ", driver=" + driver + ", engine=" + engine + "]";
    }
}

public class july29_2 {
    public static void main(String[] args) {
        Driver mukesh = new Driver("Mukesh", "Noida");

        Carr car1 = new Carr();

        car1.setDriver(mukesh);

        System.out.println(car1);
    }
}
