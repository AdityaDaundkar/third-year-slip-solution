import java.util.Scanner;

class Product {
    private int pid;
    private String pname;
    private double price;
    private int qty;

    public Product(int pid, String pname, double price, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
    }

    public double getTotalAmount() {
        return price * qty;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: $" + getTotalAmount());
    }
}

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Product Name: ");
            String pname = scanner.nextLine();
            System.out.print("Price: $");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int qty = scanner.nextInt();

            products[i] = new Product(pid, pname, price, qty);
        }

        System.out.println("Product Details:");
        for (Product product : products) {
            System.out.println("-------------------");
            product.displayProductDetails();
        }

        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getTotalAmount();
        }

        System.out.println("Total Amount for all products: $" + totalAmount);

        scanner.close();
    }
}
