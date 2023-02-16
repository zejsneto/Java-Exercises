package appformas;

public class Circulo extends Forma{
    public double raio;
    
    public double area() {
        return 2 * Math.PI * (raio * raio); 
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
      
    @Override
    public double perimetro() {
        return 2 * raio * Math.PI;
    }
    
    @Override
    public void print() {
        System.out.println("Circulo...");
        System.out.println("Perimetro: " + this.perimetro());
        System.out.println("Area: " + this.area());
    }
}
