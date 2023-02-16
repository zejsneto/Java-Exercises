package main;

/**
 * Classe Matematica. Reune as informações das entradas (tipo int e tipo boolean).
 * @author ZENETO
 */
public class Matematica {

    /**
     * Método max3() max3() - recebe três valores int como argumentos e retorna
     * o valor do maior
     *
     * @param a. valor 1.
     * @param b. valor 2.
     * @param c. valor 3.
     * @return. Retorna o maior valor entre os 3.
     */
    public static int max3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        }
        return 0;
    }

    /**
     * Método impar() recebe três entradas booleanas e retorna verdadeiro se um
     * número ímpar de entradas for true e falso caso contrário.
     *
     * @param a. Valor booleano 1.
     * @param b. Valor booleano 2.
     * @param c. Valor booleano 3.
     * @return. False para casos em que número de condições true seja par
     */
    public static boolean impar(boolean a, boolean b, boolean c) {
        if (a == true && b == true && c == false) {
            return false;
        }
        if (a == true && c == true && b == false) {
            return false;
        }
        if (c == true && b == true && a == false) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método maioria() recebe três argumentos booleanos e retorna verdadeiro se
     * pelo menos dois dos argumentos tiverem o valor true e falso caso
     * contrário.Não pode utilizar if.
     *
     * @param a. Valor booleano 1.
     * @param b. Valor booleano 2.
     * @param c. Valor booleano 3.
     * @return ...
     */
    public static boolean maioria(boolean a, boolean b, boolean c) {
        int aux = 0;

        aux = (a == true) ? aux+1 : aux;
        aux = (b == true) ? aux+1 : aux;
        aux = (c == true) ? aux+1 : aux;

        return (aux > 1) ? true : false;
    }
}
