interface F
{ 
    // public void m2() {
    //     System.out.println("m2");   // Abstract methods cannot have a body
    // }

    public static void m3() {
        System.out.println("F.m3");   // by adding static keyword we can have a body in interface method [43:40]
    }

    public default void m4() {
        System.out.println("For Common Implimentation..............");
        System.out.println("F.m4");   // by adding default keyword we can have a body in interface method [43:40]
    }
    
    void m1();
}


class FWK implements F
{
    @Override 
public void m1() {
    System.out.println("FWK.m1");
}
}

public class july22_Interface_2
{
    public static void main(String[] args) {
        F.m3();
//        F.m4();  // default method can be called only by object of implementing class
 
F f1 = new FWK();
f1.m4();  // default method can be called only by object of implementing class
f1.m1();
}
}