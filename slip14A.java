public class PowerCalculator {
    public static void main(String[] args) {
        double base = 2.0; // Replace with your base number
        int exponent = 3; // Replace with your exponent

        double result = calculatePower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    public static double calculatePower(double base, int exponent) {
        // Base case: if the exponent is 0, return 1
        if (exponent == 0) {
            return 1.0;
        }

        // Recursive case: multiply the base by itself (or divide if exponent is negative)
        if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);
        } else {
            return 1.0 / (base * calculatePower(base, -exponent - 1));
        }
    }
}
