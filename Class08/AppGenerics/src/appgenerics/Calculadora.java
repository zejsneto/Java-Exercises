package appgenerics;

public class Calculadora<T> {

    private T a;
    private T b;

    public Calculadora(T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    public T soma() {
        return this.a + this.b;
    }
}
