package ex1;

/**
 *
 * @author ZENETO
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    /**
     * Inicializa o objeto Data.
     * @param dia, valor do dia
     * @param mes, valor do mes
     * @param, valor do ano
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    /**
     * Formata a saída de texto em conjunto com valores atribuídos a Data.
     * Ex: 'dia + "/" + mes + "/" + ano;', onde dia,mes e ano são inicializas no objeto Data
     * Na prática: "10/04/1999"
     */
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
