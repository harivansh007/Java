// Demonstration of Covariant Return Type in Java

class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showDetails() {
        System.out.println("Animal Name : " + name);
    }
}


// Puppy is a subclass of Animal
class Puppy extends Animal {

    public Puppy(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }

    @Override
    public void showDetails() {
        System.out.println("Puppy Name : " + getName());
    }
}


// DogeshBhai is another subclass of Animal
class DogeshBhai extends Animal {

    private String color;

    public DogeshBhai(String name, String color) {
        super(name);
        this.color = color;

        System.out.println("DogeshBhai Constructor Called");
    }

    public void print() {
        System.out.println("Name  : " + getName());
        System.out.println("Color : " + color);
        System.out.println("----------------------");
    }

    public String getColor() {
        return color;
    }
}


// Parent Class
class Foo {

    public Animal func1() {

        System.out.println("Foo.func1()");

        return new Animal("Normal Animal");
    }
}


// Child Class
class Goo extends Foo {

    /*
     * Covariant Return Type:
     *
     * Parent method:
     * public Animal func1()
     *
     * Child method:
     * public Puppy func1()
     *
     * Puppy is a subclass of Animal.
     * Therefore, returning Puppy is allowed.
     */

    @Override
    public Puppy func1() {

        System.out.println("Goo.func1()");

        return new Puppy("Tommy");
    }
}


// Main Class
public class july28_3 {

    public static void main(String[] args) {

        System.out.println("===== Covariant Return Type =====");
        System.out.println();

        // Parent reference pointing to Child object
        Foo f1 = new Goo();

        // Runtime Polymorphism
        Animal animal = f1.func1();

        System.out.println();
        System.out.println("Returned Object:");
        System.out.println("Name : " + animal.getName());

        System.out.println();

        // Checking the actual object
        if (animal instanceof Puppy) {

            Puppy puppy = (Puppy) animal;

            System.out.println("The returned object is a Puppy.");

            puppy.bark();
            puppy.showDetails();
        }

        System.out.println();
        System.out.println("===== Direct Goo Reference =====");
        System.out.println();

        // Direct reference to Goo
        Goo g1 = new Goo();

        Puppy puppy = g1.func1();

        System.out.println("Puppy Name : " + puppy.getName());

        puppy.bark();
        puppy.showDetails();
    }
}