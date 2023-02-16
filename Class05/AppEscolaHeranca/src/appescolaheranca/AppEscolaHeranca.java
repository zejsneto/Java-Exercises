package appescolaheranca;

import java.util.Scanner;
import java.util.ArrayList;

public class AppEscolaHeranca {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = input.nextLine();
        
        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine();
        
        System.out.print("Idade: ");
        int idade = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Curso: ");
        String curso = input.nextLine();
        
        Aluno objAluno = new Aluno(nome, sobrenome, idade, curso);
        alunos.add(objAluno);
        
        for (Aluno a : alunos) {
            System.out.println(a);
        }
        
        /* Antes parte verdo do exercicio */
        //Aluno a1 = new Aluno("João","Pereira",20,"C.C.");
        //System.out.println(a1);
    }
    
}
