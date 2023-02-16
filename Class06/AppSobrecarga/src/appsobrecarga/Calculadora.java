package appsobrecarga;

public class Calculadora {

    public int square(int n) {
        return n * n;
    }

    public double square(double n) {
        return n * n;
    }

    //NAO TEM NO MATERIAL -> Sobrescrita de método toString()
    //da Classe Object
    @Override
    public String toString() {
        return "Calculadora";
    }
}
