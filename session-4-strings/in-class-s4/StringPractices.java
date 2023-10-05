import java.util.Scanner;

public class StringPractices {
    public static void main(String[] args) {
        // Initialize strings using different methods
        String s1 = new String("abc"); // Using the 'new' operator
        String s2 = "cde"; // Using string literals
        // Compare two strings
        System.out.println(s1.compareTo(s2));

        String s3 = "Abc";
        String s4 = "ABC";
        // Compare two strings
        System.out.println(s3.equals(s4));

        // Initialize and print a null string reference
        String name = null;
        System.out.println("My name is " + name);

        // Initialize and print a non-null string reference
        String name2;
        name = "Mya";
        name2 = name;
        System.out.println("My name is " + name2);

        // Prompt the user to enter strings
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name1 = in.next();
        System.out.print("Enter your last name: ");
        String name3 = in.next();

        // Print the entered names
        System.out.println("First name: " + name1);
        System.out.println("Last name: " + name3);

        // Close the scanner
        in.close();
    }
}
