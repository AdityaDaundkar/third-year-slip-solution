import java.util.Scanner;
import java.util.Arrays;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees (n): ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        // Input employee names
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees[i] = new Employee(name);
        }

        // Sort the employees by name in ascending order
        Arrays.sort(employees, (e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

        // Display sorted employee names
        System.out.println("Employee names in ascending order:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        scanner.close();
    }
}
