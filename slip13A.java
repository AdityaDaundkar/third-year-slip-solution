import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        ArrayList<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            integerList.add(num);
        }

        System.out.println("Elements of ArrayList in reverse order:");

        // Reverse the ArrayList
        Collections.reverse(integerList);

        // Display the reversed ArrayList
        for (int num : integerList) {
            System.out.println(num);
        }

        scanner.close();
    }
}
