import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWordsInFile {
    public static void main(String[] args) {
        String filePath = "your_file.txt"; // Replace with the path to your file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words

                for (String word : words) {
                    String reversedWord = reverseWord(word);
                    System.out.print(reversedWord + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
