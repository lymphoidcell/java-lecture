import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Are you a citizen (yes/no)? ");
        String citizenship = scanner.nextLine();

        // Check eligibility
        if (age >= 18) {
            if (citizenship.equalsIgnoreCase("yes")) {
                System.out.println("Congratulations! You are eligible to vote.");
            } else if (citizenship.equalsIgnoreCase("no")) {
                System.out.println("Sorry, you must be a citizen to vote.");
            } else {
                System.out.println("Invalid input for citizenship.");
            }
        } else {
            System.out.println("Sorry, you must be at least 18 years old to vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
