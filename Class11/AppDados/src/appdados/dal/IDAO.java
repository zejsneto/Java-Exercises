package appdados.dal;

import java.util.ArrayList;
import java.sql.SQLException;

public interface IDAO<T> {

    public ArrayList<T> consulta() throws SQLException;

    public T consulta(int id) throws SQLException;

    public boolean insere(T o) throws SQLException;

    public boolean altera(T o) throws SQLException;

    public boolean apaga(T o) throws SQLException;

}
