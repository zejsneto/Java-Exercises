
package exlab;

/**
 *
 * @author ZENETO
 */
public class ExLab {
    
    public static void main(String[] args) {
        Complex n1 = new Complex(5,8);
        Complex n2 = new Complex(4,9);
        
        n1.imprime();
        n2.imprime();
        
        n1.add(n2);
        n1.sub(n2);
    }
    
}
