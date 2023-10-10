import java.util.Scanner;

public class HelloWorldRevision {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        String name;
        String age;

        try {
            System.out.println("Enter a name: ");
            name = input.nextLine();

            System.out.println("Enter your age: ");
            age = input.nextLine();

            System.out.println("Hello " + name + "\nWelcome to Java!" + "\nYour age is " + age);
        } finally {
            // Close the Scanner in a finally block to ensure it gets closed even if an exception occurs
            input.close();
        }
    }
}
