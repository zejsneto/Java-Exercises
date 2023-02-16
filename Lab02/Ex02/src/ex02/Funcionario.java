
package ex02;

/**
 *
 * @author ZENETO
 */

//Classe Funcionario
public class Funcionario {
    //Três partes de infromações como atributos
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    //Get e Set para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    //Salario Mensal
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        //Se salario mensal nao for positivo, configure-o como zero
        if (salarioMensal < 0){
            salarioMensal = 0;
            
        } else {
            this.salarioMensal = salarioMensal;
        }
        this.salarioMensal = salarioMensal;
    }
    
    public double SalarioAnual(){
        return 12 * this.salarioMensal;
    }
    
    public double novoSalarioAnual(){
        return 1.1 * (12 * this.salarioMensal);
    }
    
}
