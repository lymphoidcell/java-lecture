public class FormulaCalculation {
    public static void main(String[] args) {
        // Calculation for part a
        double xA = 16;

        // Calculate a using the formula for part a
        double a = Math.pow(Math.sqrt(xA), 5) - 64;

        // Print the result for part a
        System.out.println("Part a: a = " + a);

        // Calculation for part b
        double xB = 5;
        double y = 3;

        // Calculate b using the formula for part b
        double b = Math.pow(xB, y) - Math.pow(6, xB);

        // Print the result for part b
        System.out.println("Part b: b = " + b);

        // Calculation for part c
        double z = 30;
        double xC = 2;

        // Calculate c using the formula for part c
        double c = 4 * Math.cos(z / 5) - Math.sin(Math.pow(xC, 2));

        // Print the result for part c
        System.out.println("Part c: c = " + c);
    }
}
