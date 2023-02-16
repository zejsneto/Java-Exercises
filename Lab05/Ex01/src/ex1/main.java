package ex1;

import java.util.ArrayList;

/**
 *
 * @author ZENETO
 */
public class main {

    public static void main(String[] args) {

        /* Array Lists - Funcionário  e Gerente*/
        ArrayList<Funcionário> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();

        /* Definindo Datas Nascimento para Funcionario e Gerentes */
        Data dataNasc1 = new Data(25, 04, 2001);
        Data dataNasc2 = new Data(05, 03, 1999);
        Data dataNasc3 = new Data(30, 02, 2009);
        Data dataNasc4 = new Data(18, 01, 2005);

        /* Definindo Datas de Admissão para Funcionario e Gerentes */
        Data dataAdm1 = new Data(14, 02, 2017);
        Data dataAdm2 = new Data(29, 06, 2015);
        Data dataAdm3 = new Data(02, 07, 2020);
        Data dataAdm4 = new Data(10, 05, 2019);

        /* Definindo Datas de Promoção para Gerentes */
        Data dataPro1 = new Data(02, 07, 2022);
        Data dataPro2 = new Data(10, 05, 2021);

        /* Atribuição de alguns funcionários*/
        //String nome, long cpf, Data nascimento, Data admissao, double salario
        Funcionário f1 = new Funcionário("José", 123456789, dataNasc1, dataAdm1, 2400.00);
        Funcionário f2 = new Funcionário("Maria", 791348625, dataNasc2, dataAdm2, 3999.99);

        /* Atribuição de alguns gerentes*/
        //String nome, long cpf, Data nascimento, Data admissao, double salario, int departamento, Data promocaoGerente
        Gerente g1 = new Gerente("Orlando", 987654321, dataNasc3, dataAdm3, 15000.00, 5, dataPro1);
        Gerente g2 = new Gerente("Fernanda", 852456789, dataNasc4, dataAdm4, 12000.00, 6, dataPro2);

        /* Adicionando objetos aos Arrays*/
        funcionarios.add(f1);
        funcionarios.add(f2);
        gerentes.add(g1);
        gerentes.add(g2);

        /* Chamando métodos dentro dos ArrayList para testá-los*/
        System.out.println("Funcionário 1:");
        System.out.println(f1.getNome());
        System.out.println(f1.toString());

        System.out.println("\n---/---/---/---/\n");

        System.out.println("Funcionário 2:");
        System.out.println(f2.getNome());
        System.out.println(f2.toString());

        System.out.println("\n---/---/---/---/\n");

        System.out.println("Gerente 1:");
        System.out.println(g1.getNome());
        System.out.println(g1.toString());

        System.out.println("\n---/---/---/---/\n");

        System.out.println("Gerente 2:");
        System.out.println(g2.getNome());
        System.out.println(g2.toString());
    }

}
