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
