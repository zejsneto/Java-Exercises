package appsistemapolitico;

public class Vereador extends Politico {

    private String municipio;

    public Vereador(String nome, String partido, String estado, String municipio) {
        super();
       this.municipio = municipio; 
       super.nome = nome;
       super.partido = partido;
       super.estado = estado;
       super.funcao = "Vereador";
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("Me candidato para " + this.municipio);
    }
}
