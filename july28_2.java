class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Puppy extends Animal, making it a subtype (subclass)
class Puppy extends Animal {
    public Puppy(String name) {
        super(name);
    }
}

class DogeshBhai extends Animal {
    private String color;

    public DogeshBhai(String name, String color) {
        super(name);
        this.color = color;
        System.out.println("DogeshBhai.DogeshBhai()");
    }

    public void print() {
        // Fixed the unclosed quote here:
        System.out.println("Name is : " + getName());
        System.out.println("Color is: " + color);
        System.out.println("---");
    }

    public String getColor() {
        return color;
    }
}

class Foo {
    public Animal func1() {
        System.out.println("Foo.func()");
        return null;
    }
}

class Goo extends Foo {
    // Covariant Return Type: 
    // Foo's func1 returns 'Animal', but Goo's func1 returns 'Puppy' (a subclass of Animal).
    @Override
    public Puppy func1() {
        System.out.println("Goo.func()");
        return null;
    }
}

public class july28_2 {
    public static void main(String[] args) {
        Foo f1 = new Goo();
        f1.func1();
    }
}