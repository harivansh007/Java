package Oops;

public class June25 {

	
	private int age;
	private String name, gender, city;
	
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
	
	
	public void initMethode(String name, int age, String gender, String city) {
this.name = name;
this.age = age;
this.gender = gender;
this.city = city;

	}
	
	
	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println("City is: " + city);
	}
	
	
	public static void main(String[] args) {
		June25 p1 = null; // Reference Variable
		int n;
		
		p1 = new June25();
		p1.initMethode("Harsh", 23, "male", "Bareilly");
		
		p1.wakeUp();
		p1.hustle();
		p1.eat();
		p1.sleep();
		
		System.out.println("------printing-----------------------");
		p1.print();
		
		
	}

	

}
