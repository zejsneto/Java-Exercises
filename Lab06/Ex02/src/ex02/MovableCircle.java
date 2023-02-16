package ex02;

/**
 *
 * @author ZENETO
 */
public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    /**
     * Método Movable Point.Construtor do movable point.
     * @param x, posição em x.
     * @param y, posição em y.
     * @param xSpeed, velocidade no sentido de x.
     * @param ySpeed, velocidade no sentido de y.
     * @param radius, raio do movable circle.
    */
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    /* Método para escrever os valores de Movable Circle */
    @Override
    public String toString() {
        return String.format("Movable Cirlce(x,y): " + center.toString() + "\nE com raio: " + radius + ".");
    }

    /* Métodos para alterar a posição e velocidade do Movable Circle
    *  São "puxados" do Movable Point com o "center.moveUp() por exemplo".
    */
    @Override
    public void moveUp() {
        //center.y -= center.ySpeed;
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
