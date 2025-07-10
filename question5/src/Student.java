public class Student {
    // Private data members
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation logic
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vidit");
        s.setAge(21);
        s.displayInfo();

        s.setAge(-5);
    }
}
