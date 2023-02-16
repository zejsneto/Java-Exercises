package appanimaispolimorficos;

import java.util.ArrayList;

public class AppAnimaisPolimorficos {

    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(new Peixe());
        animais.add(new Sapo());
        animais.add(new Passaro());

        //for each
        for (Animal animal : animais) {
            animal.move();
            animal.fala();
        }

        /*
        for (var animal : animais) {
            animal.move();
        }
         */
        Animal meuAnimal = new Peixe();
        meuAnimal.move();

    }

}
