package ex1;

/**
 *
 * @author ZENETO
 */
public class Gerente extends Funcionário {

    private int departamento;
    private Data promocaoGerente;
    
    /**
     * Inicializa objeto Funcionário
     *
     * @param nome, nome do gerente
     * @param cpf, cpf do gerente
     * @param nascimento, data de nascimento do gerente
     * @param admissao, data em que gerente foi admitido
     * @param salario, valor do salário do gerente
     * @param departamento, numero do departamento do gerente
     * @param promocaoGerente, data me que o gerente foi promovido
     */
    public Gerente(String nome, long cpf, Data nascimento, Data admissao, double salario, int departamento, Data promocaoGerente) {
        super(nome, cpf, nascimento, admissao, salario);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }
    
    /**
     * Retorna o número do departamento do Gerente.
     */
    public int getDepartamento() {
        return departamento;
    }
    
    /**
     * Formata a saída de texto em conjunto com valores atribuídos ao Gerente.
     * Ex: "O departamento é: " + numero do departamento do Gerente
     * Na prática: "O departamento é: 5" + etc...
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "O departamento é: " + this.departamento + ". A promoção à gerente aconteceu em: " + this.promocaoGerente + ".";
    }
}
