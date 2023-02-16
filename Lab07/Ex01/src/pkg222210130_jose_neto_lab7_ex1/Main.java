package pkg222210130_jose_neto_lab7_ex1;

import java.util.Scanner;

/**
 *
 * @author ZENETO
 */
public class Main {

    public static void main(String[] args) throws CPFException {
        Scanner input = new Scanner(System.in);

        String n = null;
        String sn = null;
        String ida = null;
        String id = "0";

        Pessoa p1 = new Pessoa(n, sn, ida, id);

        System.out.println("Digite o nome: ");
        n = input.nextLine();
        System.out.println("Digite o sobrenome: ");
        sn = input.nextLine();
        System.out.println("Digite a idade: ");
        ida = input.nextLine();

        p1.setNome(n);
        p1.setSobrenome(sn);
        p1.setIdade(ida);

        boolean verificaCPF = false;
        do {
            try {
                System.out.println("Digite o CPF: ");
                id = input.nextLine();
                p1.setCPF(id);
            } catch (Exception e) {
                System.out.printf("Error %s\n", e);
                
                System.out.println("");
                
                System.err.println("Digite o CPF novamente: ");
                id = input.nextLine();
                p1.setCPF(id);
            } finally {
                System.out.println("Nome: " + p1.getNome() + " | "
                        + "Sobrenome: " + p1.getSobrenome() + " | "
                        + "Idade: " + p1.getIdade() + " | "
                        + "CPF: " + p1.getCPF() + ".");
                verificaCPF = true;
            }
        } while (verificaCPF != true);

    }

}
