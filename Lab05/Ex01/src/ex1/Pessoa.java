package ex1;

/**
 *
 * @author ZENETO
 */
public class Pessoa {

    private String nome;
    private long cpf;
    private Data nascimento;

    /**
     * *
     * Construtor parametrizado
     *
     * @param nome, nome da pessoa
     * @param cpf, cpf da pessoa
     * @param nascimento, data de nascimento da pessoa
     */
    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    /**
     * Método que retorna o valor do nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Formata a saída de texto em conjunto com valores atribuídos a pessoa.
     * Ex: "O nome é: " + nome da pessoa 
     * Na prática: "O nome é: Jose" + etc..
     */
    @Override
    public String toString() {
        return "O nome é: " + this.nome + ". O CPF é: " + this.cpf + ". A data de nascimento é: " + this.nascimento + ".";
    }
}
