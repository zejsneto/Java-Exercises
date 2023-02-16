package appdados.controller;

import appdados.dal.AlunoDAO;
import appdados.model.Aluno;
import appdados.view.FrmPrincipal;
import java.util.ArrayList;

public class AlunoController {

    private FrmPrincipal form;

    public AlunoController(FrmPrincipal form) {
        this.form = form;
    }

    public void listaAlunos() {
        try {
            AlunoDAO alunoDao = new AlunoDAO();
            ArrayList<Aluno> alunos = alunoDao.consulta();
            
            
            //form.getTbAlunos();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
