package appescolaheranca;

public class Aluno extends Pessoa {
    private String curso;
    
    public Aluno(String nome, String sobrenome, int idade, String curso) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /* Novo Método Print*/
    @Override
    public String toString() {
        return super.getNome() + " - " + this.getCurso();
    }
}
