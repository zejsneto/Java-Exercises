package appformas;

public class AppFormas {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Circulo c1 = new Circulo(2);
        
        r1.setComprimento(5);
        r1.setLargura(10);
        
        r1.print();
        r1.perimetro();
        
        System.out.println("");
        
        c1.print();
        c1.perimetro();
        c1.area();
    }

}
