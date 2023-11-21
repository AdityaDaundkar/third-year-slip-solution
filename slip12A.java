public class ReverseStringArray {
    public static void main(String[] args) {
        // Sample string array
        String[] stringArray = {"Hello", "World", "Java", "Programming"};

        // Iterate through the array and display each string in reverse order
        for (String str : stringArray) {
            String reversedString = reverseString(str);
            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reversedString);
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
