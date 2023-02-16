package appnavio;

public class Navio {

    protected int numTripulantes;
    protected String nome;

    public Navio(int numTripulantes, String nome) {
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }
    
    public void exibirInfoGeral() {
        System.out.println("O número de tripulantes é " + this.numTripulantes + ".");
        System.out.println("O nome do navio é " + this.nome + ".");
    }
}
