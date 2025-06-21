package LiveQuestion;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Output:
        //Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)

        int number1 = 5;
        System.out.println("Original: " + number1);

        // Pre-increment
        int preIncrement = ++number1;
        System.out.println("Pre-increment: " + preIncrement);

        // Post-increment
        int number2 = 5;
        int postIncrement = number2++;
        System.out.println("Post-increment: " + number2 + " (returned " + postIncrement + ")");

        // Pre-decrement
        int number3 = 6;
        int preDecrement = --number3;
        System.out.println("Pre-decrement: " + preDecrement);

        // Post-decrement
        int number4 = 6;
        int postDecrement = number4--;
        System.out.println("Post-decrement: " + number4 + " (returned " + postDecrement + ")");
    }
}
