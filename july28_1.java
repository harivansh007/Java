class Foo {
    public static void m1() {
        System.out.println("Foo.m1()");
    }
    
    public void func1() {
        System.out.println("Foo.func()");
    }
}

class Goo extends Foo {
    // Static method hiding
    public static void m1() {
        System.out.println("Goo.m1()");
    } // Added missing closing brace here

    // Instance method overriding
    @Override
    public void func1() {
        System.out.println("Goo.func()");
    }
}

public class july28_1 {
    public static void main(String[] args) {
        // Calls Foo's static method because m1() is resolved at compile time based on reference type
        Foo.m1();

        // Polymorphism: f1 is a Foo reference, but points to a Goo object
        Foo f1 = new Goo();
        
        // Calls Goo's overridden instance method at runtime
        f1.func1();
    }
}