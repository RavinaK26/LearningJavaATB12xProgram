import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter numerator: ");
        int a = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }

        scanner.close();
    }
}