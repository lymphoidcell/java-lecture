public class Person {
    // Declare variables for the person's name and age
    private String name;
    private int age;

    // Constructor to initialize the name and age variables
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to return the person's name
    public String getName() {
        return name;
    }

    // Getter method to return the person's age
    public int getAge() {
        return age;
    }

    // Setter method to set the person's age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Create a Person object with name "Amanda" and age 34
        Person amanda = new Person("Amanda", 34);

        // Retrieve and print Amanda's information
        System.out.println("Name: " + amanda.getName());
        System.out.println("Age: " + amanda.getAge());
    }
}
