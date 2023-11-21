import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Convert the name to uppercase
        String uppercaseName = name.toUpperCase();

        // Greet the user with the uppercase name
        System.out.println("Hello, " + uppercaseName + ", nice to meet you!");

        scanner.close();
    }
}
