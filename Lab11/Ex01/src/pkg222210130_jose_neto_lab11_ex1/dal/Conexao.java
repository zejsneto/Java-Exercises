package pkg222210130_jose_neto_lab11_ex1.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ZENETO
 */
public class Conexao {
    private static Conexao conn;
    private Connection driver;
    
    public Conexao() throws SQLException {
        this.criaConexao();
    }
    
    public static Conexao getConexao() throws SQLException {
        if (conn == null) {
            conn = new Conexao();
        }
        return conn;
    }
    
    private void criaConexao() throws SQLException {
        this.driver = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
    }

    public Connection getDriver() {
        return driver;
    }
}
