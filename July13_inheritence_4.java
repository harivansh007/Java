// constructor chaining

package LearningJava;


class Animal {
	private String name;

	public Animal (String name) {
		this.name = name;
		System.out.println("Animal.Animal()");
	}
	
	
	public void wakeUp() {
		System.out.println(name+" is Wakeing up()");
	}
	public void eat() {
		System.out.println(name+" is eating");
	}
	public void Sleep() {
		System.out.println(name+" is Sleeping");
	}
	
	
	public String getName()
	{
		return name;
	}
	
}




//Extends
class DogeshBhai extends Animal {
private String color;
	public DogeshBhai(String name, String color) {
		super(name);
		this.color = color;
System.out.println(name+color+"DogeshBhai.DogeshBhai()");
	}
	
	public void print() {
		System.out.println("\nName is :"+getName());
		System.out.println("Color is :"+color);
		System.out.println("--------------------------");
	}
	public String getColor()
	{
		return color;
	}
}


class Puppy extends DogeshBhai {

	private int age;

	public Puppy(String name, String color, int age) {
		super(name, color);
		this.age = age;
		System.out.println("Puppy.puppy()");
	}
	public void print() {
		System.out.println("\nName is :"+getName());
		System.out.println("Color is :"+getColor());
		System.out.println("Age is :"+ age);
		System.out.println("--------------------------");
}
}

public class July13 {

	public static void main(String[] args) {
		DogeshBhai d1 = new DogeshBhai("Simbha", " Brown ");
		
		d1.wakeUp();
		d1.eat();
		d1.Sleep();
		d1.print();
		
		Puppy p1 = new Puppy("Surya", "Golden", 1);

				p1.wakeUp();
				p1.eat();
				p1.Sleep();
				p1.print();
				
				
	}

}
