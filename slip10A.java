import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String inputString = "Hello, World!"; // Replace with your input string
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Remove spaces and convert the string to lowercase (if needed)
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        // Loop through the characters in the string
        for (char c : inputString.toCharArray()) {
            // Ignore non-alphabetical characters and digits
            if (Character.isLetter(c)) {
                // If the character is already in the map, increment its count
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Display character frequencies
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}
