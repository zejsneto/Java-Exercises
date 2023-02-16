package appescolaheranca;

public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected int idade;
    
    public Pessoa (String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
}
