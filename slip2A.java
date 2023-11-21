public class DisplayVowels {
    public static void main(String[] args) {
        String inputString = "Hello, how are you?"; // Replace with your input string
        
        // Convert the input string to lowercase to make the comparison case-insensitive
        inputString = inputString.toLowerCase();
        
        System.out.println("Vowels in the given string:");

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }
}
