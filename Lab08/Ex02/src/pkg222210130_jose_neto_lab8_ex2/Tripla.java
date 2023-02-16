package pkg222210130_jose_neto_lab8_ex2;

/**
 *
 * @author ZENETO
 * @param <F,S,T>
 */
public class Tripla<F, S, T> {

    private F a;
    private S b;
    private T c;

    public F getA() {
        return a;
    }

    public void setA(F a) {
        this.a = a;
    }

    public S getB() {
        return b;
    }

    public void setB(S b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    /**
    *
    * Construtor Tripla. inicializa os valores.
    * @param a. Valor de a.
    * @param b. Valor de b.
    * @param c. Valor de c.
    */
    public Tripla(F a, S b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "A = "+this.a.toString() +" B = "+ this.b.toString() + " C = "+this.c.toString() + ".";
    }

}
