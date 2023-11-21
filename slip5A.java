public class PatternDisplay {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = n; i >= 1; i--) {
            // Inner loop for printing numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
