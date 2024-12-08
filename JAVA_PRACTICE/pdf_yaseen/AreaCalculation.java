// Class for Rectangle
class Rectangle {
    double length, width;

    // Constructor to initialize dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}

// Class for Circle
class Circle {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        // Create and calculate area for a rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());

        // Create and calculate area for a circle
        Circle circle = new Circle(4.0);
        System.out.println("Area of the Circle: " + circle.calculateArea());
    }
}
