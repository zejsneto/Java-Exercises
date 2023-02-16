package pkg222210130_jose_neto_lab7_ex1;

/**
 *
 * @author ZENETO
 */
public class Pessoa {

    String nome;
    String sobrenome;
    String idade;
    String CPF;
    
    /**
     * Construtor pessoa. Inicializa pessoa.
     * 
     * @param nome. Nome da pessoa.
     * @param sobrenome. SObrenome da pessoa.
     * @param idade. Idade da pessoa.
     * @param CPF. CPF da pessoa.
     */
    public Pessoa(String nome, String sobrenome, String idade, String CPF) throws CPFException {
        this.nome = nome;          
        this.sobrenome = sobrenome;
        this.idade = idade;
        
        /* Veirifica dentro do construtor se CPF tem . ou - para posteriormente exibir mensagem de erro.*/
        if (CPF.contains(".")) {
            throw new CPFException("\nErro! O CPF não pode conter . ou -!");
        }
        this.CPF = CPF;
        
        if (CPF.contains("-")) {
            throw new CPFException("\nErro! O CPF não pode conter . ou -!");
        }
        this.CPF = CPF;
    }

    /*
    * GETs e SETs para nome, sobrenome, idade e CPF.
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) throws CPFException {
        
/* Veirifica dentro do setCPF se CPF tem . ou - para posteriormente exibir mensagem de erro.*/
        if (CPF.contains(".")) {
            throw new CPFException("\nErro! O CPF não pode conter . ou -!");
        }
        this.CPF = CPF;
        
        if (CPF.contains("-")) {
            throw new CPFException("\nErro! O CPF não pode conter . ou -!");
        }
        this.CPF = CPF;
    }
    
}
