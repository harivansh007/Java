//This program is pending to be completed

class Car {
	private String name;
	public Car(String name){
		this.name = name;
		System.out.println("Car.Car()");}


		public void startEngine(){
		System.out.println("Car.startEngine()");
		System.out.println("-----------------");
		}
		public void stopEngine(){
		System.out.println("Car.stopEngine()");
		System.out.println("-----------------");
		}
		public void device(){
		System.out.println("we havd fm radio and bluetooth");
		System.out.println("-----------------");
		}
	}

class Sedan extends Car{
		public Sedan(String name){
			super(name);
			System.out.println("Sedan is extended()");
		}
	}

	class Audi extends Car{
		public Audi(String name){
			super(name);
			System.out.println("Audi.Audi()");
			
		}
	}





	


public class PENDING_july16_Overriding_2 {
public static void main(String[] args) {
	
    Car s1 = new Swift("Swift");
    s1.startEngine();
    s1.stopEngine();
    s1.device();

    // Car a1 = new Audi("Audi A8");
    // a1.startEngine();
    // a1.stopEngine();
    // a1.device();

    
    
    
    
    
    int n = 1000;
	System.out.println("before"+n);
 n =9999;
	System.out.println("after"+n);
}
}



//july14_Polimorphism                                         fix code