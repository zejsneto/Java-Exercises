
package appgenerics;

public class AppGenerics {

    public static void main(String[] args) {
        Calculadora<Integer> calc = new Calculadora<Integer>(2, 4);
        int resultado = calc.soma();
        System.out.println("Resiultado: " + resultado);
    }
    
}
