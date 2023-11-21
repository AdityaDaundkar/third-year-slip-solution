abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Cone cone = new Cone(5.0, 10.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);

        System.out.println("Cone:");
        System.out.println("Surface Area: " + cone.area());
        System.out.println("Volume: " + cone.volume());

        System.out.println("\nCylinder:");
        System.out.println("Surface Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}
