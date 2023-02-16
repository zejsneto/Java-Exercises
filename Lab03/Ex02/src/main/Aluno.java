
package main;

/**
 *
 * @author jose neto
 */
public class Aluno {
    private String nome;
    private String RA;
    private String curso;
    private Disciplina dis;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Disciplina getDis() {
        return dis;
    }

    public void setDis(Disciplina dis) {
        this.dis = dis;
    }

    /*public Aluno(String nome) {
        this.nome = nome;
    }
    
    public Aluno() {

    }

    public Aluno(String nome, String RA, String curso, Disciplina dis) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
        this.dis = dis;
    }*/
    
    
}
