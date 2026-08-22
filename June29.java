// CONSTRUCTOR

package Oops;

public class June29 {
	
	
	private int age;
	private String name, gender, city;
		
	
public June29(String name, int age, String gender, String city) //--> constructor
{  
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.city = city;

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
	
		June29 p1 = new June29("Harsh", 23, "male", "Bareilly");
		p1.print();
	
		System.out.println("---------------------------------------");
		
		//  June29 p2 = new June29();
		//  p2.initMethode("Moni", 17, "female", "Bareilly");
		//  p2.print();
	
		
		
		June29 p3 = new June29("Sakshi", 18, "female", "Bareilly");
		p3.print();
		System.out.println("---------------------------------------");
		
		
		
	}
	
	
}
