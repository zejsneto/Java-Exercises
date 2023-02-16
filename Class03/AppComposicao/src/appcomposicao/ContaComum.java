
package appcomposicao;

import java.util.Date;

/**
 *
 * @author ZENETO
 */
public class ContaComum {
    private int numero;
    private Date data;
    private Date data_enc;
    private int situacao;
    private int senha;
    private double saldo;
    
    public ContaComum() {
        this.situacao = 1;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
}
