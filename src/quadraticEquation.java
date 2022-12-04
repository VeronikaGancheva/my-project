// 6. Write a simple program, without checks to print the result of quadratic equation.
import java.util.Scanner;
public class quadraticEquation {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input c: ");
        double c = input.nextDouble();

        double result = b * b - 4.0 * a * c;
    System.out.println("Result of quadratic equation is: " + result);
    }
}

