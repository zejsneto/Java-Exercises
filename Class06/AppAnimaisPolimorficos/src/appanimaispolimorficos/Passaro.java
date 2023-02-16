package appanimaispolimorficos;

public class Passaro extends Animal {

    @Override
    public void move() {
        System.out.println("Passaro voa.");
    }

    @Override
    public void fala() {
        System.out.println("piu piu");
    }
}
