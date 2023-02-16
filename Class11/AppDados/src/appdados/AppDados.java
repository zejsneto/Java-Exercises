package appdados;

import appdados.model.Aluno;
import appdados.dal.AlunoDAO;
import appdados.view.FrmPrincipal;
import java.util.ArrayList;

public class AppDados {

    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        
        try {
            AlunoDAO alunoDao = new AlunoDAO();
            
            // Insere um novo aluno
            Aluno aluno1 = new Aluno();
            aluno1.setMatricula(4);
            aluno1.setNome("Orlando Junior");
            aluno1.setUsuario("unieorlj");
            aluno1.setSenha("9999");
            //alunoDao.insere(aluno1);
                    
            // Lista todos os alunos            
            ArrayList<Aluno> alunos = alunoDao.consulta();
            
            for (Aluno a : alunos) {
                System.out.println(a);
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
