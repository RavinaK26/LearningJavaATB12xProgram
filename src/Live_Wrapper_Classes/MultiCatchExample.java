package Live_Wrapper_Classes;

public class MultiCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            int index = 5;             // Invalid index
            int result = numbers[index] / 0;  // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArithmeticException or ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}