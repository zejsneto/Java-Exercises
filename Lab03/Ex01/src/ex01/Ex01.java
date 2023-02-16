
package ex01;

/**
 *
 * @author jose neto
 */
public class Ex01 {
    
    public static void main(String[] args) {
        Data d1 = new Data(03, 02, 2019); //03/02/2019
        
        Data d2 = new Data("Março", 2, 2019);//Março 2,2019
        
        Data d3 = new Data(61, 2019);//061 2019
        
        d1.imprimeD1(d1);
        d2.imprimeD2(d2);
        d3.imprimeD3(d3);
        
        //mesEscrito dia,ano
        
        //Janeiro 02,2019
    }
    
}
