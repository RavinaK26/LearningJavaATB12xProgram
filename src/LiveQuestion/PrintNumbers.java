package LiveQuestion;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println(i + " ");
        }
    }
}
