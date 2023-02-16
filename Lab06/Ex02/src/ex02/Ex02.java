package ex02;

/**
 *
 * @author ZENETO
 */
public class Ex02 {

    public static void main(String[] args) {
        Movable p = new MovablePoint(1, 2, 3, 4);
        System.out.print("Movable Point(x,y): ");
        System.out.println(p);

        //Depois de Mover
        System.out.println("\nMover para a direita!\n");
        p.moveRight();

        System.out.print("Movable Point(x,y): ");
        System.out.println(p);

        //Movable Circle
        System.out.println("\n ---*---*---*--- \n");
        Movable c = new MovableCircle(9, 8, 4, 2, 1);
        System.out.println(c);

        //Depois de mover
        System.out.println("\nMover para cima!\n");
        c.moveUp();
        System.out.println(c);
    }

}
