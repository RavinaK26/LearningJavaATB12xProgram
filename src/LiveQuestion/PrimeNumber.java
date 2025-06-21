package LiveQuestion;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Only check up to square root of num for efficiency
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // not a prime, exit inner loop
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
