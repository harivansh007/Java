class Car{

    public void startEngine()
{
System.out.println("Car can start with key only. ");
}
    public void run()
{
System.out.println("This Car can run with 120km/h. .");
}
    public void device()
{
System.out.println("We have FM Radio and bluetooth functionality. ..");
}

    public void turnOffEngine()
{
System.out.println("Car's engine can turn off with key only...... ");
}

}



class BMW extends Car{

    @Override
public void startEngine()
{
System.out.println("BMW can start with key only. ");
}

}


class Swift extends Car{
}







public class july20_overriding_1 {

public static void main(String[] args) {

BMW b8 = new BMW();
b8.startEngine();
b8.run();
b8.device();
b8.turnOffEngine();
System.out.println("---------------------------------------------------");
Swift s1 = new Swift();
s1.startEngine();
s1.run();
s1.device();
s1.turnOffEngine();

}

}