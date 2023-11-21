import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in decimal form, e.g., 0.05 for 5%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int compoundingFrequency = scanner.nextInt();

        System.out.print("Enter the number of years (t): ");
        int years = scanner.nextInt();

        double amount = calculateCompoundInterest(principal, annualRate, compoundingFrequency, years);

        System.out.println("The future value (including interest) is: " + amount);

        scanner.close();
    }

    public static double calculateCompoundInterest(double principal, double annualRate, int compoundingFrequency, int years) {
        double ratePerPeriod = annualRate / compoundingFrequency;
        int numberOfPeriods = compoundingFrequency * years;

        double amount = principal * Math.pow(1 + ratePerPeriod, numberOfPeriods);
        return amount;
    }
}
