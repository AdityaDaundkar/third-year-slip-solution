public class ArmstrongNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ArmstrongNumbers <num1> <num2> ...");
            return;
        }

        int[] numbers = new int[args.length];
        int armstrongCount = 0;

        // Parse command line arguments to integers and check for Armstrong numbers
        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                if (isArmstrongNumber(num)) {
                    numbers[armstrongCount] = num;
                    armstrongCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println(args[i] + " is not a valid integer.");
            }
        }

        // Display Armstrong numbers stored in the array
        if (armstrongCount > 0) {
            System.out.println("Armstrong Numbers:");
            for (int i = 0; i < armstrongCount; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else {
            System.out.println("No Armstrong numbers found in the provided input.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNum;
    }
}
