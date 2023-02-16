package appsobrecarga;

/**
 *
 * @author ZENETO
 */
public class AppSobrecarga {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("Soma inteiros = " + c.square(10));
        System.out.println("Soma decimais = " + c.square(20.5));

        /* IGUAIS */
        System.out.println(c.toString());
        System.out.println(c);

    }

}
