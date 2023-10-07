import java.util.Scanner;

public class FieldTripTransportation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people signed up for the field trip: ");
        int totalPeople = scanner.nextInt();

        // Constants
        final int BUS_CAPACITY = 45;

        // Calculate the number of buses needed
        int busesNeeded = totalPeople / BUS_CAPACITY;
        int remainingPeople = totalPeople % BUS_CAPACITY;

        // Calculate the total number of people riding in vans
        int peopleInVans = (remainingPeople > 0) ? remainingPeople : 0;

        System.out.println("Number of buses needed: " + busesNeeded);
        System.out.println("Total number of people riding in vans: " + peopleInVans);

        scanner.close();
    }
}
