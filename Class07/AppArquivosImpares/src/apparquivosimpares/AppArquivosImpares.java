
package apparquivosimpares;

import java.io.FileWriter;
import java.io.PrintWriter;

public class AppArquivosImpares {

    public static void main(String[] args) {
        try{
            FileWriter arquivo = new FileWriter("impares.txt");
            PrintWriter escritaArquivo = new PrintWriter(arquivo);
        }
        
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                escritaArquivo.println(i);
            }
        }
        arquivo.close();
        catch(Exception e) {
            
        }
    }
    
}
