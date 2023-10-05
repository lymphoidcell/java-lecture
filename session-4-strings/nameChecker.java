import java.util.Scanner;

public class nameChecker {
    public static void main(String[] args) {
        // Define the my name
        String myName = "Scholastica";

        // Create a Scanner for input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String friendName = scanner.nextLine();

        // Check if the input name matches my name
        if (friendName.equalsIgnoreCase(myName)) {
            System.out.println(friendName + " is in room 406.");
        } else {
            System.out.println("The person is not in room 406.");
        }

        // Close the scanner
        scanner.close();
    }
}
