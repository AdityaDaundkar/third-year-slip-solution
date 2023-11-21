public class DisplayAlternateCharacters {
    public static void main(String[] args) {
        String inputString = "Hello, World!"; // Replace with your input string

        System.out.println("Alternate characters from the given string:");

        for (int i = 0; i < inputString.length(); i += 2) {
            char ch = inputString.charAt(i);
            System.out.print(ch);
        }
    }
}
