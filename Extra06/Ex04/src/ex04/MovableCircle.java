package ex04;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    
    @Override
    public String toString() {
        return "0";
    }

    @Override
    public void moveUp() {
        this.center.ySpeed++;
        this.center.y += this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.ySpeed--;
        this.center.y += this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.xSpeed++;
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.xSpeed--;
        this.center.x += this.center.xSpeed;
    }

}
