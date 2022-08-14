package ex06;

/**
 *
 * @author @zejsneto
 */
public class Main {
    
    public static void main(String[] args) {
        //(side1 * side1) + (side2 * side2) == (hypotenuse * hypotenuse);
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if ((side1 * side1) + (side2 * side2) == (hypotenuse * hypotenuse)){
                        System.out.printf("The triangle with: side 1= %d side 2 = %d and hypotenuse = %d is a Pythagorean triple\n", side1, side2, hypotenuse);
                    }
                }
                
            }
            
        }
        
    }
    
}
