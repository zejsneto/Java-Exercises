package appanimaispolimorficos;

public class Peixe extends Animal {

    @Override
    public void move() {
        super.move();
        System.out.println("Peixe nada.");
    }

    @Override
    public void fala() {
        System.out.println("glub glub");
    }
}
