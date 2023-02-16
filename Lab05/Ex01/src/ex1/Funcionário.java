package ex1;

/**
 *
 * @author ZENETO
 */
public class Funcionário extends Pessoa {

    private Data admissao;
    private double salario;

    /**
     * Inicializa objeto Funcionário
     *
     * @param nome, nome do funcionário
     * @param cpf, cpf do funcionário
     * @param nascimento, data de nascimento do funcionário
     * @param admissao, data em que funcionário foi admitido
     * @param salario, valor do salário do funcionário
     */
    public Funcionário(String nome, long cpf, Data nascimento, Data admissao, double salario) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    /**
     * Retorna o valor do salário do Funcionário.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Formata a saída de texto em conjunto com valores atribuídos ao funcionário.
     * Ex: "A admissão aconteceu em: " + data em que ocorreu a admissão
     * Na prática: "A admissão aconteceu em: 00/00/2000" + etc...
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "A admissao aconteceu em: " + this.admissao + ". O salário é: R$" + this.salario + ".";
    }
}
