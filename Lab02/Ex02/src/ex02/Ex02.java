
package ex02;

import java.util.Scanner;

/**
 *
 * @author ZENETO
 */

public class Ex02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Crie dois objetos da classe Funcionario
        Funcionario fun1 = new Funcionario();
        Funcionario fun2 = new Funcionario();
        
        //Utilize a função set para entrar com as informações de cada funcionário
        //Funcionário 1
        System.out.print("Nome funcionário 1: ");
        fun1.setNome(input.nextLine());
        
        System.out.print("Sobrenome funcionário 1: ");
        fun1.setSobrenome(input.nextLine());
        
        System.out.print("Salário mensal funcionário 1: ");
        fun1.setSalarioMensal(input.nextDouble());
        
        //Para não pular a linha
        input.nextLine();
        
        //Funcionário 2
        System.out.print("Nome funcionário 2: ");
        fun2.setNome(input.nextLine());
        
        System.out.print("Sobrenome funcionário 2: ");
        fun2.setSobrenome(input.nextLine());
        
        System.out.print("Salário mensal funcionário 2: ");
        fun2.setSalarioMensal(input.nextDouble());
        
        System.out.println("////////////////");
        
        //Exiba o salário anual de cada um
        System.out.println("Salário anual funcionário 1: " + fun1.SalarioAnual());
        System.out.println("Salário anual funcionário 2: " + fun2.SalarioAnual());
        
        //Aumento 10% e exiba novamente o salario anual de cada um
        System.out.printf("Novo salário anual funcionário 1: %.2f \n" , fun1.novoSalarioAnual());
        System.out.printf("Novo salário anual funcionário 2: %.2f \n", fun2.novoSalarioAnual());
        
        
        
        
        
        
    }
    
}
