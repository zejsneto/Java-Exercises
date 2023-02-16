
package excarro;

/**
 *
 * @author ZENETO
 */
public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private int km;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    //Construtor padrão
    public Carro() {
        
    }
    
    //Construtor parametrizado
    public Carro(String modelo, int ano, double preco) {
        this.setModelo(modelo);
        this.setAno(ano);
        this.setPreco(preco);
    }
    
    public Carro(String modelo, String cor, int ano, double preco, int km) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
        this.setPreco(preco);
        this.setKm(km);
    }
    
}
