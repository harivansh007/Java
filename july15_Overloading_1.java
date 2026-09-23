// Overload
package LearningJava;

class Calculations {
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	public void sum(int a, float b) {
		System.out.println(a + b);
	}
	public void sum(float a, int b) {
		System.out.println(a + b);
	}

}
public class july15_Overloading_1 {
public static void main(String[] args) {
	Calculations c1 = new Calculations();
	
	c1.sum(11, 22);
	c1.sum(3.0f, 50);
}
}



//july14_Polimorphism