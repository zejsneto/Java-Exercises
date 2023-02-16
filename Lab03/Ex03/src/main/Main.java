
package main;

/**
 *
 * @author jose neto
 */
public class Main {
    
    public static void main(String[] args) {
        MonitorCardiaco p1 = new MonitorCardiaco("Jose","Neto",25,8,2001);
        
        System.out.println("A idade é: " + p1.calcIdade());
        System.out.println("A frequência máxima é: " + p1.calcFreqMax());
        System.out.println("O intervalo da frequência alvo é: " + p1.calcFreqAlvoIntervalo1() + " e " + p1.calcFreqAlvoIntervalo2());
    }
    
}
