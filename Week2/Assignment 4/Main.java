public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Exercise 1-----------------");
        Product p1 = new Book();
        Product p2 = new Movie();
        MovablePoint point = new MovablePoint(0, 0, 4, 5);

        p1.setName("lost in space");
        p1.setPrice(150);

        p2.setName("impossible");
        p2.setPrice(70);

        System.out.println(p1.getName());
        System.out.println(p1.getDiscount());

        System.out.println(p2.getName());
        System.out.println(p2.getDiscount());
        System.out.println("-----------------Exercise 2-----------------");

        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();
    }
}
