
package appcomposicao;

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
    
    public Pessoa() {
        this.conta = new ContaComum();
    }
    
    
    public ContaComum getConta() {
        return this.conta;
    }
}
