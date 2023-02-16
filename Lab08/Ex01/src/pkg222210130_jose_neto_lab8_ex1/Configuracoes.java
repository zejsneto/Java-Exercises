package pkg222210130_jose_neto_lab8_ex1;

import java.util.HashMap;

/**
 *
 * @author ZENETO
 */
public class Configuracoes {

    private HashMap<String, String> config;

    private static Configuracoes instancia;

    public static Configuracoes getInstancia() {
        if (instancia == null) {
            instancia = new Configuracoes();
        }
        return instancia;
    }

    // Construtor privado
    private Configuracoes() {
        config = new HashMap<String, String>() {
            {
                put("Salva", "salvaRegistro");
                put("Le", "leRegistros");
            }
        };
    }

    public String getValor(String chave) {
        return this.config.get(chave);
    }
}
