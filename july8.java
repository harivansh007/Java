//  Calling Compatability of instance variable, static variable, instance method and static method.



package Oops;

class july8 {

	String name;    // --> instance variable
	static int id;  // --> Static variable
	
	public void m1() {  // --> instance method
		m2();
		s2();
		System.out.println(name);
		System.out.println(id); 	
	}
	
	public void m2() {
		System.out.println(name);
		System.out.println(id); 	
	}
	
	public static void s1() {  // --> Static method
		System.out.println(name);
		System.out.println(id); 	
	}
	

	public static void s2() {
		m1();
		s1();
		System.out.println(name);
		System.out.println(id); 	
	}
}
