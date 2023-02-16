package appanimaispolimorficos;

public abstract class Animal {
//abstract nao deixa classe ser instanciavel
    
    public void move() {
        System.out.print("Animal: ");
    }

    public abstract void fala();
}
