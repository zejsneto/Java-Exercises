package appsistemapolitico;

public class Prefeito extends Politico{
    private String municipio;
    
    
    public Prefeito(String nome, String partido, String estado, String municipio) {
       super();
       this.municipio = municipio; 
       super.nome = nome;
       super.partido = partido;
       super.estado = estado;
       super.funcao = "Prefeito";
    }
    
    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("Me candidato para " + this.municipio);
    }
    
}
