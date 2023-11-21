public class AreaCalculator {
    public static void main(String[] args) {
        // Calculate and display the area of a circle
        double circleArea = calculateArea(5.0); // Radius of the circle
        System.out.println("Area of Circle: " + circleArea);

        // Calculate and display the area of a triangle
        double triangleArea = calculateArea(8.0, 6.0); // Base and height of the triangle
        System.out.println("Area of Triangle: " + triangleArea);

        // Calculate and display the area of a rectangle
        double rectangleArea = calculateArea(4.0, 7.0); // Length and width of the rectangle
        System.out.println("Area of Rectangle: " + rectangleArea);
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
