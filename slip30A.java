import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                throw new InvalidNumberException("Number is Invalid");
            }

            if (input.equals("0")) {
                throw new InvalidNumberException("Number is Zero");
            }

            if (!input.matches("-?\\d+")) {
                throw new InvalidNumberException("Number is Invalid");
            }

            int number = Integer.parseInt(input);
            if (isPalindrome(number)) {
                System.out.println("The number " + number + " is a palindrome.");
            } else {
                System.out.println("The number " + number + " is not a palindrome.");
            }
        } catch (InvalidNumberException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Number is not valid.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(Math.abs(number));
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }
}
