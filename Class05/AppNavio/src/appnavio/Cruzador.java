package appnavio;

import static java.lang.Math.sqrt;

public class Cruzador extends NavioDeGuerra {

    protected int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }
   
    @Override
    public void poderDeFogo() {
        System.out.println("O valor calculado de ataque é " + this.ataque/(sqrt(this.numCanhoes)) + ".");
    }
}
