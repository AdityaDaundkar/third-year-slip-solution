public class SumOfDigitsRecursive {
    public static void main(String[] args) {
        int number = 12345; // Replace with your desired number
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        // Base case: if the number is a single digit, return the number itself
        if (number < 10) {
            return number;
        }

        // Recursive case: calculate the sum of the last digit and the sum of the remaining digits
        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        return lastDigit + calculateSumOfDigits(remainingDigits);
    }
}
