
package excarro;

/**
 *
 * @author ZENETO
 */
public class ExCarro {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        Carro c2 = new Carro(/*Modelo*/"Chevrolet Onix", /*Ano*/2017, /*Preco*/50.000);
        
        Carro c3 = new Carro("Fiat Idea","Branco",2015,35.500,60000);
    }
    
}
