// Question 15: Shape Area Overriding
package question15;

class Shape {
    double calculateArea() { return 0; }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    @Override
    double calculateArea() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    @Override
    double calculateArea() { return length * width; }
}

public class Question15 {
    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape r = new Rectangle(5, 4);
        System.out.printf("Area of Circle (r=7)        : %.2f%n", c.calculateArea());
        System.out.printf("Area of Rectangle (5 x 4)   : %.2f%n", r.calculateArea());
    }
}
