/**
 * QuadraticSolver - A class to solve quadratic equations of the form ax^2 + bx
 * + c = 0
 */
public class QuadraticSolver {

    /**
     * Solves a quadratic equation given its coefficients
     * 
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term
     * @return an array containing the two roots of the equation
     */
    public static double[] solveQuadratic(int a, int b, int c) {
        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b - discriminant) / (2 * a);
        double root2 = (-b + discriminant) / (2 * a);

        return new double[] { Math.min(root1, root2), Math.max(root1, root2) };
    }
}