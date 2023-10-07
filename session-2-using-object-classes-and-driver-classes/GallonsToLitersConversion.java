import java.util.Scanner;

public class GallonsToLitersConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double numGallons;
        double convertToLiters;

        // Prompt the user for the number of gallons
        System.out.print("Enter the number of gallons: ");

        // Read the number of gallons as a double
        numGallons = scanner.nextDouble();

        // Convert gallons to liters
        convertToLiters = numGallons * 3.785;

        // Display the output
        System.out.println("Equivalent volume in liters: " + convertToLiters);

        // Close the scanner to release resources (optional, but good practice)
        scanner.close();
    }
}
