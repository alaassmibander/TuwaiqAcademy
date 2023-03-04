public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getarea() {

        return 3.14 * radius * radius;
    }

    public double getperimeter() {

        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + radius + " , which is a subclass of " + super.toString();
    }
}
