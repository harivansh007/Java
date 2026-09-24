public class july27_toString_2 {
    private int age;
    private String name, gender, city;

    // Constructor
    public july27_toString_2(String name, int age, String gender, String city) {
        this.name = name;
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
        this.gender = gender;
        this.city = city;
        System.out.println("Person.Person()");
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    // Print method
    public void print() {
        System.out.println("Name is...: " + name);
        System.out.println("Age is...: " + age);
        System.out.println("Gender is.... : " + gender);
        System.out.println("City is... ..: " + city);
        System.out.println("---");
    }

    // Main method
    public static void main(String[] args) {
        july27_toString_2 vinod = new july27_toString_2("Vinod", 25, "Male", "Delhi");
        
        vinod.print();
        System.out.println("........");
    }
}