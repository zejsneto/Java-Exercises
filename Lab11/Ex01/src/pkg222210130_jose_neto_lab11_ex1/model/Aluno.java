package pkg222210130_jose_neto_lab11_ex1.model;

/**
 *
 * @author ZENETO
 */
public class Aluno {
    private String nome;
    private String curso;
    private int previsao;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, String curso, int previsao) {
        this.setNome(nome);
        this.setCurso(curso);
        this.setPrevisao(previsao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPrevisao() {
        return previsao;
    }

    public void setPrevisao(int previsao) {
        this.previsao = previsao;
    }
    
    @Override
    public String toString(){
        return String.format("%s\t%s\t%d", this.getNome(), this.getCurso(),this.getPrevisao());
    }
}
