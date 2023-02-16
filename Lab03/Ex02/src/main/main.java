
package main;

/**
 *
 * @author jose neto
 */
public class main {
    
    public static void main(String[] args) {
        //Escolhido usar Agregação, pois o objeto-todo (aluno) precisa das informações da disciplina e professor.
        //Não é aluno se não tem ao menos uma disciplina para estudar.
        //Toda disciplina tem ao menos um professor.
        //Caso não há aluno, a disciplina e o professor continuirão exisitindo, por isso foi escolhido agregação.
        Professor profe = new Professor();
        profe.setNome("Orlando");
        profe.setDepartamento("C.C.");
        
        Disciplina disci = new Disciplina();
        disci.setCodigo("CC3642");
        disci.setNome("Orientação à Objetos");
        disci.setProf(profe);
        
        Aluno a1 = new Aluno();
        a1.setNome("José");
        a1.setRA("22.221.013-0");
        a1.setCurso("C.C.");
        a1.setDis(disci);
        
        /*
        Aluno a2 = new Aluno("Joao","22.221.014-2","C.C", disci);
        */
        
        System.out.println("///--PROFESSOR--///");
        //System.out.println("Nome: " + a1.getDis().getProf().getNome());
        System.out.println("Nome: " + disci.getProf().getNome());
        System.out.println("Departamento: " + disci.getProf().getDepartamento());
        System.out.println("///--DISCIPLINA--///");
        System.out.println("Código: " + a1.getDis().getCodigo());
        System.out.println("Nome: " + a1.getDis().getNome());
        System.out.println("///--ALUNO--///");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("RA: " + a1.getRA());
        System.out.println("Curso: " + a1.getCurso());
        /*
        System.out.println("///--ALUNO 2--///");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("RA: " + a2.getRA());
        System.out.println("Curso: " + a2.getCurso());
        */
    }
    
}
/*
main<disciplina.java<professor.java
disci<getProf()<getNome
*/