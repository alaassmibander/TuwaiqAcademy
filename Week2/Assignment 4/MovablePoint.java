public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
        System.out.println("Your point now is in :(" + x + "," + y + ")");
    }

    @Override
    public void moveDown() {
        y += ySpeed;
        System.out.println("Your point now is in :(" + x + "," + y + ")");
    }

    @Override
    public void moveLeft() {
        moveLeft:
        x -= xSpeed;
        System.out.println("Your point now is in :(" + x + "," + y + ")");
    }

    @Override
    public void moveRight() {
        moveRight:
        x += xSpeed;
        System.out.println("Your point now is in :(" + x + "," + y + ")");
    }
}
