package LearningJava;

class Google {
	String name, gender;
	int id, age;
	
	
	
	//Constructor Overloading--------------------------
	
	public Google()
	{
		System.out.println("Google.Google()");
	}
	
	public Google(String name)
	{
		this.name = name;
		System.out.println("Google.Google()");
	}
	
	public Google(String name, String gender)
	{
		this.name = name;
		this.gender = gender;
		System.out.println("Google.Google()");
	}
	
	public Google(String name, String gender, int id)
	{
		this.name = name;
		this.gender = gender;
		this.id = id;
		System.out.println("Google.Google()");
	}
	
	public Google(String name, String gender, int id, int age)
	{
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
		System.out.println("Google.Google()");
	}
}
//---------------------------------------------------------


public class july16_Overloading_1 {
		
public static void main(String[] args) {
	Google g1 = new Google();
	Google g2 = new Google("Guest");
	Google g3 = new Google("Guest", "Male");
	Google g4 = new Google("Guest", "Male", 333);
	Google g5 = new Google("Guest", "Male", 333, 30);
	

}}
