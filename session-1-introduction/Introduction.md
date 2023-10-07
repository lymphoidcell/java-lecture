# Introduction to Java Programming
The **java.util.Scanner** class in Java is a part of the Java Standard Library and is used for reading input from various sources, such as the console, files, or strings. It provides a simple and convenient way to parse and process input data.

```java
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        String name;
        String age;

        System.out.println("Enter a name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextLine();

        System.out.println("Hello " + name + "\nWelcome to Java!" + "\nYour age is " + age);
    }
}
```
Here are some key aspects and functionalities of the **java.util.Scanner** class:
1. Initialization
   ```java
   Scanner scanner = new Scanner(System.in); // Read input from the console
   ```
2. Reading Input
   ```java
   int intValue = scanner.nextInt();         // Read an integer
   double doubleValue = scanner.nextDouble(); // Read a double
   String stringValue = scanner.nextLine();   // Read a line of text
   ```
3. Delimiter
   ```java
   scanner.useDelimiter(","); // Use a comma as the delimiter
   ```
4. Error Handling
   ```java
   if (scanner.hasNextInt()) {
       int intValue = scanner.nextInt();
   } else {
       // Handle the case where the input is not an integer
   }
   ```
5. Closing the Scanner
   ```java
   scanner.close();
   ```
6. Resource Management
   ```java
   try (Scanner scanner = new Scanner(new File("input.txt"))) {
       // Read and process data here
   } catch (FileNotFoundException e) {
      // Handle file not found exception
   }
   ```
# HelloWorld class code explanation
The Java code from HelloWorld class earlier is one of examples that used the **java.util.Scanner** class to read input from the console (System.in), and display a personalized greeting message along with the entered name and age. Here is an explanation of the key aspects and functionalities of the Scanner class being used in the code for this session:
1. **Creating a Scanner Object** &rarr; In the main method, a Scanner object named input is created and initialized to read input from System.in, which represents the standard input stream (usually the keyboard).
   ```java
   Scanner scanner = new Scanner(System.in);
   ```
2. **Prompting for User Input** &rarr; The program prompts the user for their name and age using System.out.println statements to display messages.
   ```java
   System.out.println("Enter a name: ");
   name = input.nextLine();

   System.out.println("Enter your age: ");
   age = input.nextLine();
   ```
3. **Reading User Input** &rarr; The input.nextLine() method is used to read the user's input as strings. The entered name is stored in the name variable, and the age is stored in the age variable.
4. **Concatenating and Displaying Output** &rarr; After reading the user's input, the program uses string concatenation to construct a personalized greeting message. It combines the entered name and age with additional text.
   ```java
   System.out.println("Hello " + name + "\nWelcome to Java!" + "\nYour age is " + age);
   ```
5. **User Interaction** &rarr; The program provides a simple interactive experience by printing messages to the console, waiting for the user to enter their name and age, and then displaying a customized greeting.
