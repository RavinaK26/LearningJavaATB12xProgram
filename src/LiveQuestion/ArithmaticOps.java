package LiveQuestion;

public class ArithmaticOps {
    public static void main(String[] args) {

    //Addition: 15 Subtraction: 5 Multiplication: 50 Division: 2 Modulus: 0
    //Arithmatic Operators

        int number1 = 10;
        int number2 = 5;

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;

        System.out.println("Addition:" + addition);
        System.out.println("Subtraction:" + subtraction);
        System.out.println("Multiplication:" + multiplication);
        System.out.println("Division:" + division);
        System.out.println("Modulus:" + modulus);

    //Assignment Operators
        int value = 10;

        value += 5;
        System.out.println("\nAfter +=" +value);

        value -= 5;
        System.out.println("After -=" +value);

        value *= 5;
        System.out.println("After *=" +value);

        value /= 5;
        System.out.println("After /=" +value);

        value %= 5;
        System.out.println("After %=" +value);

    }
}
