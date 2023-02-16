package ex03;

import java.util.Scanner;

/**
 *
 * @author @zejsneto
 */
public class DataTeste {
    
    public static void main(String[] args) {
        //Sem input
        Data hoje = new Data(8, 27, 2022);   
        hoje.exibeData();
        System.out.println("");
     
        //Com input
        Scanner input = new Scanner (System.i+n);
        Data p1 = new Data();
           
        System.out.print("Mês: ");
        p1.setMes(input.nextInt());
        
        System.out.print("Dia: ");
        p1.setDia(input.nextInt());
        
        System.out.print("Ano: ");
        p1.setAno(input.nextInt());
        
        p1.exibeData();
        System.out.println("");  
    }  
}
