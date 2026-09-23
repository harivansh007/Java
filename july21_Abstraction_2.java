// TV

// Abstract class
abstract class TV {
    abstract void turnon();
    abstract void turnoff();
}

// Concrete class implementing the abstract methods
class TVRemote extends TV {
    @Override
    void turnon() {
        System.out.println("TV is turned ON.");
    }
    @Override
    void turnoff() {
        System.out.println("TV is turned OFF.");
    }
}

public class july21_Abstraction_2 {
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnon();
        remote.turnoff();
    }
}