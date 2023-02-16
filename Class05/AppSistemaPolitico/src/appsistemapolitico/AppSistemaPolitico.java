package appsistemapolitico;

import java.util.ArrayList;
import java.util.Scanner;

public class AppSistemaPolitico {

    public static void main(String[] args) {
        ArrayList<Prefeito> prefeitos = new ArrayList<>();
        ArrayList<Vereador> vereadores = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        /* Cria prefeitos 1,2 e 3 */
        for (int i = 0; i < 3; i++) {
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Partido: ");
            String partido = input.nextLine();

            System.out.print("Estado: ");
            String estado = input.nextLine();

            System.out.print("Município: ");
            String municipio = input.nextLine();

            Prefeito objPref = new Prefeito(nome, partido, estado, municipio);
            prefeitos.add(objPref);

            /*
            for (Prefeito a : prefeitos) {
            System.out.println(a);
            }
             */
        }

        /* Cria vereadores 1,2 e 3 */
        for (int i = 0; i < 3; i++) {
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Partido: ");
            String partido = input.nextLine();

            System.out.print("Estado: ");
            String estado = input.nextLine();

            System.out.print("Município: ");
            String municipio = input.nextLine();

            Vereador objVere = new Vereador(nome, partido, estado, municipio);
            vereadores.add(objVere);

            /*
            for (Vereador a : vereadores) {
            System.out.println(a);
            }
             */
        }

        for (Prefeito a : prefeitos) {
            a.apresentacao();
        }

        for (Vereador a : vereadores) {
            a.apresentacao();
        }
    }
}
