package LearningJava;


class Animal {
	private String name;

	
	
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


class DogeshBhai extends Animal {
	
	}




public class July13 {

	public static void main(String[] args) {
		DogeshBhai d1 = new DogeshBhai();
		
		d1.wakeUp();
		d1.eat();
		d1.Sleep();

	}

}
