class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class DataValidation {
    public static void main(String[] args) {
        try {
            String panNumber = "ABCDE1234F"; // Replace with the PAN number to validate
            validatePAN(panNumber);

            String mobileNumber = "1234567890"; // Replace with the mobile number to validate
            validateMobileNumber(mobileNumber);

            // If both validations pass, display the data
            System.out.println("PAN Number: " + panNumber);
            System.out.println("Mobile Number: " + mobileNumber);
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validatePAN(String panNumber) throws InvalidDataException {
        // PAN number should be 10 characters long and follow a specific format
        if (panNumber.length() != 10 || !panNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            throw new InvalidDataException("Invalid PAN Number");
        }
    }

    public static void validateMobileNumber(String mobileNumber) throws InvalidDataException {
        // Mobile number should be 10 digits long and contain only digits
        if (mobileNumber.length() != 10 || !mobileNumber.matches("[0-9]{10}")) {
            throw new InvalidDataException("Invalid Mobile Number");
        }
    }
}
