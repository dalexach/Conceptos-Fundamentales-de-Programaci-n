import java.util.Scanner;

/**
 * Main - A class to handle user input and output for solving quadratic
 * equations
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input coefficients
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Solve the equation
        double[] roots = QuadraticSolver.solveQuadratic(a, b, c);

        // Print the results
        System.out.printf("%.0f %.0f%n", roots[0], roots[1]);

        scanner.close();
    }
}