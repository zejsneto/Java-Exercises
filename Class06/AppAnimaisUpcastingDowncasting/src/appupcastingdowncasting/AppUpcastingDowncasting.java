package appupcastingdowncasting;

import java.util.ArrayList;

public class AppUpcastingDowncasting {

    public static void main(String[] args) {
        //Upcasting
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Analista();

        f1.batePonto();
        f2.batePonto();

        //Downcasting
        Gerente g = (Gerente) f1;
        Analista a = (Analista) f2;

        g.batePonto();
        g.demite();
        a.batePonto();

        //Lista de funcionarios
        ArrayList<Funcionario> listaFunc = new ArrayList<>();
        listaFunc.add(f1);
        listaFunc.add(f2);
        listaFunc.add(g);
        listaFunc.add(a);
        
        for (var f : listaFunc) {
            //Não daria certo pos analista não possui demite()
            //((Gerente)f).demite(); //casting -> EX: (int)3.14 ¦ (char)65
            
            f.batePonto();
        }
        
        ((Gerente)listaFunc.get(0)).demite();
        //((Gerente)listaFunc.get(2)).demite();
        // 0 1 2 3
        // G A G A
        
        //Transformar analista em gerente
        //Não dá certo pq n é herança.
        //((Gerente) ((Funcionario)a)).demite();

    }

}
