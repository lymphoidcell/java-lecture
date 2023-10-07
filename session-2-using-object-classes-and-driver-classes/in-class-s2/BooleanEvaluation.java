public class BooleanEvaluation {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        boolean true_false;

        // Display the value of true_false after each assignment
        System.out.println("Initial value of true_false: " + (true_false = false));
        System.out.println("After assignment 1 (j < 5): " + (true_false = (j < 5)));
        System.out.println("After assignment 2 (j > 3): " + (true_false = (j > 3)));
        System.out.println("After assignment 3 (j < i): " + (true_false = (j < i)));
        System.out.println("After assignment 4 (i < 5): " + (true_false = (i < 5)));
        System.out.println("After assignment 5 (j <= 5): " + (true_false = (j <= 5)));
        System.out.println("After assignment 6 (6 < 6): " + (true_false = (6 < 6)));
        System.out.println("After assignment 7 (i != j): " + (true_false = (i != j)));
        System.out.println("After assignment 8 (i == j || i < 50): " + (true_false = (i == j || i < 50)));
        System.out.println("After assignment 9 (i == j && i < 50): " + (true_false = (i == j && i < 50)));
        System.out.println("After assignment 10 (i > j || true_false && j >= 4): " + (true_false = (i > j || true_false && j >= 4)));
        System.out.println("After assignment 11 (!(i < 2 && j == 5)): " + (true_false = (!(i < 2 && j == 5))));
        System.out.println("After assignment 12 (!true_false): " + (true_false = !true_false));
    }
}
