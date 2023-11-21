import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ASCIIValuesFromFile {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with the path to your file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int charCode;

            System.out.println("ASCII Values of Characters in the File:");
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                System.out.println(character + ": " + charCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
