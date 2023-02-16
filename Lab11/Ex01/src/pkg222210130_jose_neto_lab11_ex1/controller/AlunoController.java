package pkg222210130_jose_neto_lab11_ex1.controller;

import pkg222210130_jose_neto_lab11_ex1.view.FrmPrincipal;
import pkg222210130_jose_neto_lab11_ex1.model.Aluno;
import pkg222210130_jose_neto_lab11_ex1.dal.AlunoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZENETO
 */
public class AlunoController {
    
    private FrmPrincipal form;
    
    public AlunoController(FrmPrincipal form) {
        this.form = form;
    }
    
    // Cadastrar
    public void cadastraAlunos() {
        try {
            AlunoDAO alunoDao = new AlunoDAO();

            // Insere um novo aluno
            Aluno aluno1 = new Aluno();
            aluno1.setNome(form.getTxtNome().getText());
            aluno1.setCurso(form.getTxtCurso().getText());
            aluno1.setPrevisao(Integer.valueOf(form.getTxtPrevisao().getText()));
            alunoDao.insere(aluno1);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }
    
    // Exibir alunos
    public void listaAlunos() {
        try {
            AlunoDAO alunoDao = new AlunoDAO();
            ArrayList<Aluno> alunos = alunoDao.consulta();
            
            String[] colunas = {"Nome", "Curso", "Previsão de Conslusão"};
            DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);
            for (Aluno a : alunos) {
                Object[] data = {a.getNome(), a.getCurso(), a.getPrevisao()};
                tableModel.addRow(data);
            }
            form.getTbAlunos().setModel(tableModel);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
        }
    }
    
    // Apagar alunos
    public void apagaAlunos() {
        try {
            AlunoDAO alunoDao = new AlunoDAO();

            // Apaga aluno existente
            Aluno aluno3 = new Aluno();
            aluno3.setNome(form.getTxtNomeDeletar().getText());
            alunoDao.apaga(aluno3);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }
    
    // Atualizar alunos
    public void atualizaAlunos() {
        try {
            AlunoDAO alunoDao = new AlunoDAO();

            // Apaga aluno existente
            Aluno aluno4 = new Aluno();
            aluno4.setNome(form.getTxtNome().getText());
            aluno4.setCurso(form.getTxtNovoCurso().getText());
            aluno4.setPrevisao(Integer.valueOf(form.getTxtNovaPrevisao().getText()));
            alunoDao.atualiza(aluno4);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
}
