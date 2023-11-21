import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search for: ");
        String searchName = scanner.nextLine();

        int foundIndex = -1; // Initialize with -1 to indicate not found

        // Iterate through the array to search for the name
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                foundIndex = i;
                break; // Exit the loop if the name is found
            }
        }

        if (foundIndex != -1) {
            System.out.println(searchName + " found at index " + foundIndex);
        } else {
            System.out.println(searchName + " not found in the array.");
        }

        scanner.close();
    }
}
