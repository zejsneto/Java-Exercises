package appnavio;

public class NavioDeGuerra extends Navio {

    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }
    
    public void exibirArmas() {
        super.exibirInfoGeral();
        this.poderDeFogo();
    }
    
    
    public void poderDeFogo() {
        System.out.println("O valor de ataque é " + this.ataque + ".");
    }
}
