class NumberIsZeroException extends Exception {
    public NumberIsZeroException() {
        super("Number Is Zero");
    }
}

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        try {
            int number = getInputNumber();
            int sum = calculateSum(number);
            System.out.println("Sum of first and last digit: " + sum);
        } catch (NumberIsZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getInputNumber() throws NumberIsZeroException {
        // You can modify this method to accept user input.
        // For simplicity, I'm using a predefined number here.
        int number = 0; // Replace with your code to get user input

        if (number == 0) {
            throw new NumberIsZeroException();
        }

        return number;
    }

    public static int calculateSum(int number) {
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }

        return firstDigit + lastDigit;
    }
}
