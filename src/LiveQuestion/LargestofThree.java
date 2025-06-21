package LiveQuestion;

import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        } else if (c > a && c > b) {
            System.out.println(c + " is the largest");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Two or more numbers are equal and largest");
        }
    }
}
