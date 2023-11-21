import java.io.*;

public class FileCopyWithTransformation {
    public static void main(String[] args) {
        // Input and output file paths
        String sourceFilePath = "source.txt";
        String targetFilePath = "target.txt";

        try (
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(targetFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            int charCode;
            while ((charCode = bufferedReader.read()) != -1) {
                char ch = (char) charCode;

                // Transform the character
                char transformedChar = transformCharacter(ch);

                // Write the transformed character to the target file
                bufferedWriter.write(transformedChar);
            }

            System.out.println("File copied and transformed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static char transformCharacter(char ch) {
        if (Character.isLetter(ch)) {
            // Change the case of letters
            if (Character.isUpperCase(ch)) {
                return Character.toLowerCase(ch);
            } else {
                return Character.toUpperCase(ch);
            }
        } else if (Character.isDigit(ch)) {
            // Replace digits with '*'
            return '*';
        } else {
            // Keep other characters unchanged
            return ch;
        }
    }
}
