package appnavio;

public class NavioMercante extends Navio {

    protected double capacidadeCarga;
    protected double carga;

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }  
    
    public void carregamento() {
        super.exibirInfoGeral();
        System.out.println("O volume do navio é " + this.carga/this.capacidadeCarga + ".");
    }
}
