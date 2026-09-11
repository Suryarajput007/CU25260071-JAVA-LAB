class Circle {
    double radius;

    static double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}