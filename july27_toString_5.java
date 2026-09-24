public class july27_toString_5 {
    private int age;
    private String name, gender, city;

    // Constructor
    public july27_toString_5(String name, int age, String gender, String city) {
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
        // First object (Vinod)
        july27_toString_5 vinod = new july27_toString_5("Vinod", 34, "Male", "Pune");
        System.out.println(vinod); // Calls overridden toString()
        System.out.println("----");

        // Second object (Ashish)
        july27_toString_5 ashish = new july27_toString_5("Ashish", 34, "Male", "Pune");
        System.out.println(ashish.hashCode()); // Prints the integer hash code
        System.out.println("------------");
    }
}