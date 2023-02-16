package main;

/**
 * Classe pessoa. Reune as informações de pessoa (nome, telefone e ID).
 *
 * @author ZENETO
 */
public class Pessoa {

    private String nome;
    private String telefone;
    private int ID;

    /**
     * Construtor pessoa.
     *
     * @param nome. recebe o nome da pessoa.
     * @param telefone. recebe o telefone da pessoa.
     */
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String setPessoa() {
        setNome(nome);
        setTelefone(telefone);
        return null;
    }
}
