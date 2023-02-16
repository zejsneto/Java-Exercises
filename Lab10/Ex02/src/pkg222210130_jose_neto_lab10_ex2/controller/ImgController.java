package pkg222210130_jose_neto_lab10_ex2.controller;

import pkg222210130_jose_neto_lab10_ex2.view.FrmPrincipal;

/**
 *
 * @author ZENETO
 */
public class ImgController {
    private FrmPrincipal janela;
    
    public ImgController(FrmPrincipal janela){
        this.janela = janela;
    }

    public void mover(java.awt.event.MouseEvent evt) {
        /*
        int X = evt.getXOnScreen()-(janela.getLblImagem().getWidth()/2);
        int Y = evt.getYOnScreen()-(janela.getLblImagem().getHeight()/2);
       
        janela.getLblImagem().setLocation(X, Y);
        */
        
        //Mantido o dividido por 3.
        janela.getLblImagem().setLocation(evt.getXOnScreen()/3, evt.getYOnScreen()/3);
    }
}
