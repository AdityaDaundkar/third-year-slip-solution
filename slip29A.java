import java.util.Scanner;

class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new AgeOutOfRangeException("Candidate is not eligible to vote due to age.");
            } else {
                System.out.println("Candidate is eligible to vote.");
            }
        } catch (AgeOutOfRangeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Invalid input or other exception.");
        } finally {
            scanner.close();
        }
    }
}
