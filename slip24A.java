import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCharactersInFile {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with the path to your file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int digitCount = 0;
            int spaceCount = 0;
            int characterCount = 0;
            int charCode;

            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;

                if (Character.isDigit(character)) {
                    digitCount++;
                } else if (Character.isWhitespace(character)) {
                    spaceCount++;
                }

                characterCount++;
            }

            System.out.println("Number of digits: " + digitCount);
            System.out.println("Number of spaces: " + spaceCount);
            System.out.println("Number of characters: " + characterCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
