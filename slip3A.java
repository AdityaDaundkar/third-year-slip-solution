public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // Replace with the number you want to check
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    // Static method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
}
