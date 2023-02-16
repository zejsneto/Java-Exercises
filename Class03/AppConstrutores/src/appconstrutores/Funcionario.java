
package appconstrutores;

/**
 *
 * @author ZENETO
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private int idade;
    private String sexo;
    private int numero;
    
    /*Construtor é a porta de entrada da Classe.*/
    
    //Construtor padrão
    public Funcionario() {
        /*
        Setar dado padrão:
        this.idade = 18;
        Se o cara não colocar nada, a idade será 18.
        
        //Inicializar a conexão com o Banco de Dados (BD).
        */
    }
    //Construtor parametrizado
    public Funcionario(String nome, 
            String sobrenome, 
            double salarioMensal, 
            int idade, 
            String sexo, 
            int numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;
    }
}
