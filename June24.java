package Oops;

public class June24 {

	public int age;
	public String name, gender, city;
	
	public void wakeUp() {
		System.out.println("Person.wakeUp()");
	}
	
	public void hustle() {
		System.out.println("Person.hustle()");
	}
	
	public void eat() {
		System.out.println("Person.eat()");
	}
	
	public void sleep() {
		System.out.println("Person.sleep()");
	}
	
	
	public static void main(String[] args) {
		June24 p1 = null; // Reference Variable
		int n;
		
		p1 = new June24();
		p1.name = "Vinod";
		p1.age = 34;
		p1.gender = "male";
		p1.city = "pune";
		
		p1.wakeUp();
		p1.hustle();
		p1.eat();
		p1.sleep();
		
		System.out.println("-----------------------------");
		
		System.out.println("Name is: " + p1.name);
		System.out.println("Age is: " + p1.age);
		System.out.println("Gender is: " + p1.gender);
		System.out.println("City is: " + p1.city);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
