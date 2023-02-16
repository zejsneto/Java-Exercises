package appsomamvc.controller;

import appsomamvc.model.CalculadoraSoma;
import appsomamvc.view.FrmPrincipal;

public class CalculadoraSomaController {
    
    private CalculadoraSoma calculadora;
    private FrmPrincipal janela;
    
    public CalculadoraSomaController(FrmPrincipal janela){
        this.janela = janela;
        this.calculadora = new CalculadoraSoma();
    }
    
    public void calculaSoma(){
        //View
        int numero1 = Integer.valueOf(janela.getTxtNumero1().getText());
        int numero2 = Integer.valueOf(janela.getTxtNumero2().getText());
        //Model
        int resultado = calculadora.soma(numero1, numero2);
        //View
        janela.getTxtResultado().setText(String.valueOf(resultado));
    }
    
}
