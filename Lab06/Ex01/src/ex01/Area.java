package ex01;

/**
 *
 * @author ZENETO
 */
public class Area {

    private double comprimento;
    private double largura;
    private double lado;

    /**
     * Construtor Area. Recebe dois parametros.
     * 
     * @param comprimento, declara o comprimento do retangulo
     * @param largura, declara a largura do retangulo
     */
    public Area(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    /**
     * Construtor Area.Recebe um parametro.
     * 
     * @param lado, declara o lado do quadrado.
     */
    public Area(double lado) {
        this.lado = lado;
    }

    /**
     * Método Calcula.recebe dois parametros e faz a execução da conta da área do retângulo
     * 
     * @param comprimento, declara o comprimento do retangulo
     * @param largura, declara a largura do retangulo
     * @return, retorna o valor da ára do retangulo
     */
    public double calcula(double comprimento, double largura) {
        return comprimento * largura;
        //return  areaRet;
    }

    /**
     * Método Calcula.recebe um parametros e faz a execução da conta da área do quadrado
     * 
     * @param lado, declara o lado do quadrado
     * @return, retorna o valor da ára do quadrado
     */
    public double calcula(double lado) {
        return this.lado * this.lado;
        //return "Área do quadrado: " + areaQua;
    }

    
}

