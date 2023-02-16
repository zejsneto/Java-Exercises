package pkg222210130_jose_neto_lab11_ex1.dal;

import pkg222210130_jose_neto_lab11_ex1.model.Aluno;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ZENETO
 */
public class AlunoDAO implements IDAO<Aluno> {

    private Conexao conn;

    public AlunoDAO() throws Exception {
        this.conn = Conexao.getConexao();
    }

    @Override
    public ArrayList<Aluno> consulta() throws SQLException {
        ArrayList<Aluno> alunos = new ArrayList<>();

        String sql = "SELECT nome, curso, previsao FROM alunos;";
        PreparedStatement ps = this.conn.getDriver().prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();

        while (rs.next()) {
            Aluno objAluno = new Aluno();
            objAluno.setNome(rs.getString("nome"));
            objAluno.setCurso(rs.getString("curso"));
            objAluno.setPrevisao(rs.getInt("previsao"));
            alunos.add(objAluno);
        }

        return alunos;
    }

    @Override
    public Aluno consulta(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean insere(Aluno o) throws SQLException {
        String sql = "INSERT INTO alunos (nome, curso, previsao) VALUES (?, ?, ?)";
        PreparedStatement ps = this.conn.getDriver().prepareStatement(sql);
        ps.setString(1, o.getNome());
        ps.setString(2, o.getCurso());
        ps.setInt(3, o.getPrevisao());
        return ps.execute();
    }

    @Override
    public boolean atualiza(Aluno o) throws SQLException {
        String sql = "UPDATE alunos SET curso = ? WHERE nome = ?;";
        PreparedStatement ps = this.conn.getDriver().prepareStatement(sql);
        ps.setString(1, o.getCurso());
        //ps.setInt(2, o.getPrevisao());
        ps.setString(2, o.getNome());

        return ps.execute();
    }

    @Override
    public boolean apaga(Aluno o) throws SQLException {
        String sql = "DELETE FROM alunos WHERE nome = ? ";
        PreparedStatement ps = this.conn.getDriver().prepareStatement(sql);
        ps.setString(1, o.getNome());
        return ps.execute();
    }

}
