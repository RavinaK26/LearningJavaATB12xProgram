package LiveQuestion;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("The number is zero");
        }

        scanner.close();
    }
}