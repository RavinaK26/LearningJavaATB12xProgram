package Live_Wrapper_Classes;

public class MaxFinder {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 5, 30, 15};

        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        Integer max = numbers[0];  // Start with the first element

        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max: " + max);
    }
}
