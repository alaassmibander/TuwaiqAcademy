public class Square extends Rectangle {
    private double side;

    public Square() {

    }

    public Square(double side) {

    }

    public Square(String color, boolean filled, double side) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double width) {
        this.side = width;
    }

    @Override
    public String toString() {
        return "A Square with side= " + side + " , which is a subclass of " + super.toString();
    }
}
