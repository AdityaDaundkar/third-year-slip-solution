public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are both equal to 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }
}
