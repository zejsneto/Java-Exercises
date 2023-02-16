package ex02;

/**
 *
 * @author ZENETO
 */
public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    /**
     * Método Movable Point. Construtor do movable point.
     * @param x, posição em x.
     * @param y, posição em y.
     * @param xSpeed, velocidade no sentido de x.
     * @param ySpeed, velocidade no sentido de y.
    */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /* Método para escrever os valores de Movable Point */
    @Override
    public String toString() {
        return String.format(x + "," + y + "\nCom xSpeed: " + xSpeed + " e ySpeed:  " + ySpeed + ".");
    }

    /* Métodos para alterar a posição e velocidade do Movable Point*/
    @Override
    public void moveUp() {
        this.ySpeed++;
        y += ySpeed;
        x += xSpeed;
    }

    @Override
    public void moveDown() {
        this.ySpeed--;
        y += ySpeed;
        x += xSpeed;
    }

    @Override
    public void moveLeft() {
        this.xSpeed--;
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public void moveRight() {
        this.xSpeed++;
        x += xSpeed;
        y += ySpeed;
    }

}
