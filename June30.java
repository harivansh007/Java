// GETTER SETTER

package Oops;

public class June30 {

	
	
	

	private int age;
	private String name, gender, city;
		
	
	public June30(String name, int age, String gender, String city) {
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
	
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	public String getName() 
	{
		return name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	
	
	
	public void print() {
		System.out.println("---------------------------------------");		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println("City is: " + city);		
		System.out.println("---------------------------------------");
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		June30 p1 = new June30("Harsh", 23, "male", "Bareilly");
	//	p1.print();


		June30 p3 = new June30("Sakshi", 18, "female", "Bareilly");
	//	p3.print();


		
		p3.setAge(49);
		
		if(p3.getAge()>=40) {
			System.out.print("Congrats " + p3.getName());
		}
		else {
			System.out.print("Sorry " + p3.getName());
		}
		
	}
	
	
	
}
