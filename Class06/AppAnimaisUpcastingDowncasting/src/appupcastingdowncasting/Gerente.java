package appupcastingdowncasting;

public class Gerente extends Funcionario {

    @Override
    public void batePonto() {
        System.out.println("Gerente entrou...");
    }
    
    public void demite() {
        System.out.println("Demitindo...");
    }
}
