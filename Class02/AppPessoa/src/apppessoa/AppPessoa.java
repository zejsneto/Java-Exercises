package apppessoa;

import java.util.Scanner;
/**
 *
 * @author @zejsneto
 */
public class AppPessoa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade=10;
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.print("Nome: ");
        p1.setNome(input.nextLine());
        System.out.println("Nome digitado: " + p1.getNome());
        System.out.print("CPF: ");
        p1.setCpf(input.nextLine());
        System.out.println("CPf digitado: " + p1.getCpf());
        System.out.print("Idade: ");
        p1.setIdade(input.nextInt());
        System.out.println("Idade digitada: " + p1.getIdade());
        
        //Para não pular a linha
        input.nextLine();
        
        System.out.print("Nome: ");
        p2.setNome(input.nextLine());
        System.out.println("Nome digitado: " + p2.getNome());
        System.out.print("CPF: ");
        p2.setCpf(input.nextLine());
        System.out.println("CPf digitado: " + p2.getCpf());
        System.out.print("Idade: ");
        p2.setIdade(input.nextInt());
        System.out.println("Idade digitada: " + p2.getIdade());
        
        //Para não pular a linha
        input.nextLine();
        
        System.out.print("Nome: ");
        p3.setNome(input.nextLine());
        System.out.println("Nome digitado: " + p3.getNome());
        System.out.print("CPF: ");
        p3.setCpf(input.nextLine());
        System.out.println("CPf digitado: " + p3.getCpf());
        System.out.print("Idade: ");
        p3.setIdade(input.nextInt());
        System.out.println("Idade digitada: " + p3.getIdade());
    }
    
}
