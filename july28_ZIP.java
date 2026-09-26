class Thar {
    String brandName;
    String color;

    // Strong Association
    final Engine engine;
    Driver driver;

    Thar() {
        engine = new Engine(444, 2342);
    }

    @Override
    public String toString() {
        return "Thar [brandName=" + brandName
                + ", color=" + color
                + ", engine=" + engine
                + ", driver=" + driver + "]";
    }
}

class Engine {
    int power;
    int cc;

    Engine(int power, int cc) {
        this.power = power;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine [power=" + power + ", cc=" + cc + "]";
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver [name=" + name + "]";
    }
}

public class july28_ZIP {
    public static void main(String[] args) {

        Thar t1 = new Thar();

        t1.brandName = "Mahindra";
        t1.color = "Black";

        t1.driver = new Driver("Rahul");

        System.out.println(t1);
    }
}
