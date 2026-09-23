
interface A {
    void m1();
    void m2();
}

interface B {
    void f1();
    void f2();
}

class InterfaceEx implements A, B {

    @Override
    public void m1() {
        System.out.println("m1() method implemented");
    }

    @Override
    public void m2() {
        System.out.println("m2() method implemented");
    }

    @Override
    public void f1() {
        System.out.println("f1() method implemented");
    }

    @Override
    public void f2() {
        System.out.println("f2() method implemented");
    }
}

public class july27_Interface_1 {

    public static void main(String[] args) {

        InterfaceEx obj = new InterfaceEx();

        obj.m1();
        obj.m2();
        obj.f1();
        obj.f2();
    }
}