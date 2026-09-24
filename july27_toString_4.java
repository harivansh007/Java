public class july27_toString_4 {
    private int age;
    private String name, gender, city;

    // Constructor
    public july27_toString_4(String name, int age, String gender, String city) {
        this.name = name;
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
        this.gender = gender;
        this.city = city;
        System.out.println("Person.Person()");
    }

    // Overriding toString() to provide a custom string representation
    @Override
    public String toString() {
        return "Person = [name = " + name + ", gender = " + gender + ", Age = " + age + ", city = " + city + "]";
    }

    // Main method
    public static void main(String[] args) {
        july27_toString_4 vinod = new july27_toString_4("Vinod", 34, "Male", "Pune");
        
        // Printing the object automatically calls the overridden toString() method
        System.out.println(vinod);
        System.out.println("----");
    }
}