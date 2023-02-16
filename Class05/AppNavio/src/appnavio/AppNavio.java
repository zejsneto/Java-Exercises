package appnavio;

public class AppNavio {

    public static void main(String[] args) {
        /* Testa Objeto Navio*/
        System.out.println("Navio");
        /* NumTripulantes, Nome*/
        Navio n1 = new Navio(9,"Thousand Sunny");
        n1.exibirInfoGeral();
        System.out.println("");
        
        /* Testa Objeto NavioDeGuerra*/
        System.out.println("Navio de Guerra");
        /* Blindagem, Poder de Ataque, Num Tripulantes, Nome*/
        NavioDeGuerra n2 = new NavioDeGuerra(0.75,125.00,6,"Going Merry");
        n2.exibirArmas();
        System.out.println("");
        
        /* Testa Objeto NavioMercante*/
        System.out.println("Navio Mercante");
        /* CapacidadeCarga, Carga, NumTripulantes, Nome */
        NavioMercante n3 = new NavioMercante(100.00,50.00,67,"Navio Mercantil");
        n3.carregamento();
        System.out.println("");
        
        /* Testa Objeto Cruzador*/
        System.out.println("Cruzador");
        /* NumCanhoes = ataque / sqrt (numCanhoes),(Não aparecem): Blindagem, Poder de Ataque, Num Tripulantes, Nome */
        Cruzador n4 = new Cruzador(100,0.75,10.00,6,"Holandes Voador");
        n4.poderDeFogo();
        System.out.println("");
        
        /* Testa Objeto PortaAvioes*/
        System.out.println("Porta Aviões");
        /* NumAvioes = ataque * (numAvioes * numAvioes) */ 
                                        //NumAvioes , blindagem, Ataque, NumTripulantes, Nome
        PortaAvioes n5 = new PortaAvioes(10,0.75,2.00,6,"Porta Avioes SHIELD");
        n5.poderDeFogo();
        System.out.println("");

        /*
            for (Prefeito a : prefeitos) {
            System.out.println(a);
            }
        
        
        
        
        
        
        /*
        System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Navio             |\n");
        System.out.print("| Opção 2 - Navio de Guerra   |\n");
        System.out.print("| Opção 3 - Navio Mercante    |\n");
        System.out.print("| Opção 4 - Cruzador          |\n");
        System.out.print("| Opção 5 - Porta Aviões      |\n");
        System.out.print("| Opção 6 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.ou   t.println("Opção Navio Selecionado");
               
                System.out.print("Número de Tripulantes: ");
                int numTripulantes = input.nextInt();

                System.out.print("Nome: ");
                String nome = input.nextLine();
                
                Navio n = new Navio();
                

                break;

            case 2:
                System.out.println("Opção Navio de Guerra Selecionado");
                
                
                
                break;

            case 3:
                System.out.println("Opção Navio Mercante Selecionado");
                break;

            case 4:
                System.out.println("Opção Cruzador Selecionado");
                break;

            case 5:
                System.out.println("Opção Porta Aviões Selecionado");
                break;

            case 6:
                System.out.println("Até logo!");
                input.close();
        }*/
    }

}
