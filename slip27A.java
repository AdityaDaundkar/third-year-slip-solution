import java.util.Scanner;

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 1000) {
                throw new NumberOutOfRangeException("Number is out of Range");
            }

            System.out.println("Factors of " + number + " are:");
            displayFactors(number);
        } catch (NumberOutOfRangeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }

    public static void displayFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
