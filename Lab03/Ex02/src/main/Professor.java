
package main;

/**
 *
 * @author jose neto
 */
public class Professor {
    private String nome;
    private String departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //Sem parametro para caso não haja entrada de dados
    public Professor() {
        this.nome = "João";
        this.departamento = "C.C.";
    }

}
