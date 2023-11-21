interface Shape {
    double area();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Sphere sphere = new Sphere(3.0);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Sphere: " + sphere.area());
    }
}
