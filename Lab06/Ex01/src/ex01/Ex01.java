package ex01;

/**
 *
 * @author ZENETO
 */
public class Ex01 {

    public static void main(String[] args) {
        Area r = new Area(6,10);
        
        Area q = new Area(4);
        
        System.out.print("Área do retângulo: ");
        System.out.println(r.calcula(6,10));
        System.out.print("Área do quadrado: ");
        System.out.println(q.calcula(4));
    }

}
