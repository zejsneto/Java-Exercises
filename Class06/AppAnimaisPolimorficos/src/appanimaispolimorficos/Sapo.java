package appanimaispolimorficos;

public class Sapo extends Animal {

    @Override
    public void move() {
        System.out.println("Sapo pula.");
    }

    @Override
    public void fala() {
        System.out.println("herbert");
    }
}
