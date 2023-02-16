package appsistemapolitico;

public class Politico {
    protected String nome;
    protected String partido;
    protected String estado;
    protected String funcao;
    
    public Politico() {

    }
    
    public void apresentacao() {
        System.out.print("Olá, meu nome é " + this.nome + ", sou do partido " + 
                            this.partido + ", do estado " + this.estado + ", "
                            + "minha funnção é " + this.funcao);
    }
    
}
