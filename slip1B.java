import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyNonNumericData {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // Replace with your source file path
        String destinationFilePath = "destination.txt"; // Replace with your destination file path

        try {
            FileReader reader = new FileReader(sourceFilePath);
            FileWriter writer = new FileWriter(destinationFilePath);

            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;

                // Check if the character is not a digit (0-9)
                if (!Character.isDigit(character)) {
                    writer.write(character);
                }
            }

            reader.close();
            writer.close();

            System.out.println("Non-numeric data copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
