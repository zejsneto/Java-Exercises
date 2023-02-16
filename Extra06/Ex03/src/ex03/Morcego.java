package ex03;

public class Morcego extends Animal implements IWalkable, IFlyable {

    int velocidadeVoo;

    public int getVelocidadeVoo() {
        return velocidadeVoo;
    }

    public void setVelocidadeVoo(int velocidadeVoo) {
        this.velocidadeVoo = velocidadeVoo;
    }
    
    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public void andar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString(){
        return "O morcego " + this.nome + " voa com uma velocidade de: " + this.getVelocidade() + " Km/h."; 
    }

    //@Override
    public double getVelocidade() {
        return this.getVelocidadeVoo();
    }
}
