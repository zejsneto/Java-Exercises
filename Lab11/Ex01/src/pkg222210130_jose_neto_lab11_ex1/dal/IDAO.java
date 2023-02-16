package pkg222210130_jose_neto_lab11_ex1.dal;

import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author ZENETO
 * @param <T>
 */
public interface IDAO<T> {

    public ArrayList<T> consulta() throws SQLException;

    public T consulta(int id) throws SQLException;

    public boolean insere(T o) throws SQLException;

    public boolean atualiza(T o) throws SQLException;

    public boolean apaga(T o) throws SQLException;
}
