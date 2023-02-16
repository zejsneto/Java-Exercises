
package appconstrutores;

/**
 *
 * @author ZENETO
 */
public class AppConstrutores {

    public static void main(String[] args) {
        //Usando o construtor padrão
        Funcionario f1 = new Funcionario();
        
        //Usando o construtor parametrizado
        Funcionario f2 = new Funcionario("João",
                "Pereira",
                1212.25,
                45,
                "Masculino",
                42);
        
        Funcionario f3 = new Funcionario("José", "Neto", 2500.0, 21, "Masculino", 42);
        
    }
        
}
