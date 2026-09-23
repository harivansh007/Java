// Overload
package LearningJava;

class Calculation {
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	public void sum(int a, double b) {
		System.out.println(a + b);
	}
	public void sum(double a, int b) {
		System.out.println(a + b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	public void sum(int a, double b, double c) {
		System.out.println(a + b + c);
	}
	public void sum(int a, int b, double c) {
		System.out.println(a + b + c);
	}

}
public class july15_Overloading_2 {
public static void main(String[] args) {
	Calculation c1 = new Calculation();
	
	c1.sum(11, 22);
	c1.sum(3.0, 50);
	c1.sum(50, 7.0, 89.3483094);
}
}

