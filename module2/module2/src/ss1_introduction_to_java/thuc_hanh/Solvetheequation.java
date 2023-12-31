package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Solvetheequation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("x = " + answer);
        } else {
            if (b == c) {
                System.out.print("All x are correct");
            } else {
                System.out.print("The equation has no solution");
            }
        }
    }
}
