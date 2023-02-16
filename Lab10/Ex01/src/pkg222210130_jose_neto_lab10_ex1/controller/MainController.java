package pkg222210130_jose_neto_lab10_ex1.controller;

import java.util.Random;
import pkg222210130_jose_neto_lab10_ex1.view.FrmPrincipal;

/**
 *
 * @author ZENETO
 */
public class MainController {
    
    Random aleatorio = new Random();    
    
    private FrmPrincipal janela;
    
    public MainController(FrmPrincipal janela){
        this.janela = janela;
    }

    public void mudaPosicao() {
        janela.getBtnMain().setLocation(aleatorio.nextInt(380), aleatorio.nextInt(300));
    }
}
