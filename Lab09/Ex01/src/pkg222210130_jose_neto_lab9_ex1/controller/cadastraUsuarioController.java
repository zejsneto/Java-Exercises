package pkg222210130_jose_neto_lab9_ex1.controller;

import pkg222210130_jose_neto_lab9_ex1.model.cadastraUsuario;
import pkg222210130_jose_neto_lab9_ex1.view.FrmPrincipal;

/**
 *
 * @author ZENETO
 */
public class cadastraUsuarioController {

    private cadastraUsuario cadastra;
    private FrmPrincipal janela;

    public cadastraUsuarioController(FrmPrincipal janela) {
        this.janela = janela;
        this.cadastra = new cadastraUsuario();
    }

    public void cadastraUsuario() {
        String nome = String.valueOf(janela.getTxtNome().getText());
        String sobrenome = String.valueOf(janela.getTxtSobrenome().getText());
        int idade = Integer.valueOf(janela.getTxtIdade().getText());
        String CPF = String.valueOf(janela.getTxtCPF().getText());
        String sexo = String.valueOf(janela.getRadioBtnMasculino().getText());
    }
    
    
}
