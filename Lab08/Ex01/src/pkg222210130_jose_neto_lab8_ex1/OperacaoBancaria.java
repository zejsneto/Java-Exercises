package pkg222210130_jose_neto_lab8_ex1;

/**
 * Enumerador OperacaoBancaria.
 * Define as operações bancárias disponíveis.
 * @author ZENETO
 */
public enum OperacaoBancaria {
    Saque("Saque"),
    Depósito("Depósito"),
    Transferência("Transferência");

    private final String descricao;

    OperacaoBancaria(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}