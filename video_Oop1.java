package Oops;

class video_Oop1 {

	int id, age;
	String name, gender;
	
	public video_Oop1(int id, int age, String name, String gender) {
		this.name = name;
		this.id=id;
		this.gender=gender;
		this.age=age;
	}
	
	public void eat() {
		System.out.print("eeat");
	}
	public void study() {
		System.out.print("study");
	}
	public void sleep() {
		System.out.print("sleep");
	}
	public void print() {
		System.out.println("-------------------------------");
		System.out.println("Your name is "+name);
		System.out.println("Your id is "+id);
		System.out.println("Your age is "+age);
		System.out.println("Your gender is "+gender);
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {
		video_Oop1 f = new video_Oop1(1, 18, "harsh", "gmail");
	f.print();
	}
	
}
