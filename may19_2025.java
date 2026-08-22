// BEFORE INHERITENCE

package Oops;


//single level inheritence
class X {
	public void add() {
		System.out.print("addition\n");
	}
	public void sub() {
		System.out.print("subtraction\n"); } }


class Y extends X {
public void mul() {
	System.out.print("multiplication\n"); } }


class Z extends Y {
	 }


public class may19_2025 {
public static void main(String[] args) {
	X x = new X();
	x.add();
	x.sub();
	System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	Y y = new Y();
	y.add();
	y.sub();
	y.mul();
	System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	Z z = new Z();
	z.add();
	z.sub();
	z.mul();
	
	
	
	
	
}
}
