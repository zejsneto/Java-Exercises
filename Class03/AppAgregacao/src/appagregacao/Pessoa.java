
package appagregacao;

import java.util.Date;

/**
 *
 * @author ZENETO
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private double renda;
    private Date data;
    private ContaComum conta;
    
    public void setConta(ContaComum conta) {
        this.conta = conta;
    }
    
    public ContaComum getConta() {
        return this.conta;
    }
}
