package LearningJava;


class Animal {
	private String name;

	public Animal (String name) {
		this.name = name;
		System.out.println("");
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
	
}







public class July13 {

	public static void main(String[] args) {
		Animal d1 = new Animal("Simbha");
		
		d1.wakeUp();
		d1.eat();
		d1.Sleep();

	}

}
