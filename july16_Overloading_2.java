package LearningJava;

class Google {
	String name, gender;
	int id, age;
	
	
	
	//Constructor Overriding--------------------------
	
	public Google()
	{
		System.out.println("Google.Google()");
	}
	
	private Google(String name)
	{
		this();
		this.name = name;
		System.out.println("Google.Google(1)");
	}
	
	private Google(String name, String gender)
	{
		this (name);
		this.gender = gender;
		System.out.println("Google.Google(2)");
	}
	
	private Google(String name, String gender, int id)
	{
		this (name, gender);
		this.id = id;
		System.out.println("Google.Google(3)");
	}
	
	public Google(String name, String gender, int id, int age)
	{
		this (name, gender, id);
		this.age = age;
		System.out.println("Google.Google(4)");
	}
}
//---------------------------------------------------------


public class july16_Overloading_2 {
		
public static void main(String[] args) {
	
	//Google g1 = new Google();

	Google g5 = new Google("Guest", "Male", 333, 30);
	

}}
