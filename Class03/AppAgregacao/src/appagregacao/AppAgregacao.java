
package appagregacao;

/**
 *
 * @author ZENETO
 */
public class AppAgregacao {

    public static void main(String[] args) {
        ContaComum conta = new ContaComum();
        conta.setNumero(1);
        
        Pessoa p1 = new Pessoa();
        p1.setConta(conta);
        
        p1.getConta().setNumero(2);
    }
    
}
