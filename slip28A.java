public class CountIntegersInArgs {
    public static void main(String[] args) {
        int integerCount = 0;

        for (String arg : args) {
            try {
                // Try to parse the argument as an integer
                Integer.parseInt(arg);
                integerCount++;
            } catch (NumberFormatException e) {
                // Ignore non-integer arguments
            }
        }

        System.out.println("Number of integers in the arguments: " + integerCount);
    }
}
