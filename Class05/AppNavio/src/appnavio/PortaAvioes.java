package appnavio;

public class PortaAvioes extends NavioDeGuerra {
    protected int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }  
    
    @Override
    public void poderDeFogo() {
        System.out.println("O valor calculado de ataque é " + this.ataque*(this.numAvioes * this.numAvioes) + ".");
    }
}
