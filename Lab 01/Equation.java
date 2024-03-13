import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        first_degree_equation(scanner);
        solveSystem(scanner);
        second_degree_equation(scanner);

        scanner.close();
        System.exit(0);
    }

    public static void first_degree_equation(Scanner scanner) {
        System.out.println("First degree equation");
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation has infinite solutions");
            } else {
                System.out.println("Equation with no solution");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }

    public static void solveSystem(Scanner scanner) {
        System.out.println("Enter coefficients for the first equation:");
        System.out.print("a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("b1: ");
        double b1 = scanner.nextDouble();

        System.out.println("Enter coefficients for the second equation:");
        System.out.print("a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("b2: ");
        double b2 = scanner.nextDouble();

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            if (a11 * b2 - a21 * b1 == 0 && a12 * b2 - a22 * b1 == 0) {
                System.out.println("System has infinitely many solutions");
            } else {
                System.out.println("System has no solution");
            }
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    public static void second_degree_equation(Scanner scanner) {
        System.out.println("Second degree equation");
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Equation has infinite solutions");
                } 
                else {
                    System.out.println("Equation with no solution");
                }
            } 
            else {
                double x = -c / b;
                System.out.println("x = " + x);
            }
        } 
        else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Equation has no real solutions");
            } 
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Equation has one real solution: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Equation has two real solutions: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
