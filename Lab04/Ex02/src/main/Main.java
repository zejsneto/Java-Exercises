package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ZENETO
 */
public class Main {

    public static void main(String[] args) {
        /* ArrayList agenda */
        ArrayList<Pessoa> agenda = new ArrayList<>();

        /* Recebe inputs */
        Scanner input = new Scanner(System.in);

        /* Cria o menu no terminal*/
        System.out.println("Entre com uma das seguintes opções: ");
        System.out.println("n [nova entrada]");
        System.out.println("d [apaga registro da agenda]");
        System.out.println("p [imprime toda a agenda]");
        System.out.println("q [sai do programa]");
        System.out.print("Digite sua opção: ");

        /* Variáveis instanciadas */
        String opcao = input.nextLine();
        String nome;
        String telefone;

        /* Configura o terminal para corresponder às opções*/
        while (true) {
            /* Caso criar nova entrada*/
            if (opcao.equals("n")) {
                System.out.println("Opção [nova entrada] selecionada");
                /* Recebe o nome */
                System.out.println("Entre com o nome: ");
                nome = input.nextLine();
                /* Recebe o telefone */
                System.out.println("Entre com o telefone: ");
                telefone = input.nextLine();
                
                /* Adiciona na agenda */
                agenda.add(new Pessoa(nome, telefone));
            }
            /* Caso apagar registro da agenda*/
            else if (opcao.equals("d")) {
                System.out.println("\nOpção [apaga registro da agenda] selecionada\n");
                /* Recebe o nome */
                System.out.println("Entre com o nome: ");
                nome = input.nextLine();
                
                /* Remove da agenda */
                agenda.remove(nome);
            }
            /* Caso imprimir toda a agenda*/
            else if (opcao.equals("p")) {
                System.out.println("\nOpção [imprime toda a agenda] selecionada\n");
                for (Pessoa contato : agenda) {
                    System.out.println("Nome: " + contato.getNome() + "\n Telefone: " + contato.getTelefone());
                }            
            }
            /* Caso sair do programa */
            else if (opcao.equals("d")) {
                System.out.println("\nOpção [sai do programa] selecionada");
                //menu.close();
                break;
            } 
            /* Caso receba uma entrada inválida*/ 
            else {
                System.out.println("\nOpção Inválida!");            
            }
        }
    }
}
