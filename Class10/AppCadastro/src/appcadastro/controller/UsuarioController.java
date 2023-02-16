package appcadastro.controller;

import appcadastro.view.FrmUsuario;
import appcadastro.model.Usuario;
import javax.swing.JOptionPane;

public class UsuarioController {

    private FrmUsuario janela;
    private Usuario usuario;

    public UsuarioController(FrmUsuario view) {
        this.janela = view;
        //this.usuario = new Usuario();
    }

    public void cadastraUsuario() {
        String nome = this.janela.getTxtNome().getText();
        String sobrenome = this.janela.getTxtSobrenome().getText();
        String email = this.janela.getTxtEmail().getText();
        int idade = Integer.valueOf(this.janela.getTxtIdade().getText());

        //Insere dados no banco de dados
        //Insere dados no arquivo
        Usuario usuario = new Usuario(nome, sobrenome, email, idade);
        if (usuario.cadastra()) {
            JOptionPane.showMessageDialog(janela, "Ok");
        }

        //JOptionPane.showMessageDialog(janela,"O usuário foi cadastrado com sucesso!");
    }
}
