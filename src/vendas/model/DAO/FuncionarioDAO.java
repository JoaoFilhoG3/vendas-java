package vendas.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vendas.controller.Conexao;
import vendas.model.Fornecedor;
import vendas.model.Funcionario;

public class FuncionarioDAO {
    //Método para inserir um novo Funcionario no banco de dados
    public void add(Funcionario funcionario) {
        try {

            Connection con = Conexao.abrirConexao();

            String sql
                    = "INSERT INTO "
                    + "funcionario (nome, telefone, cpf, rg) "
                    + "VALUES (?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getTelefone());
            ps.setString(3, funcionario.getCpf());
            ps.setString(4, funcionario.getRg());

            ps.executeUpdate();

            Conexao.fecharConexao(con);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    //Método para listar todos os Funcionarios do banco de dados
    public List<Funcionario> getAll() {
        List<Funcionario> lFun = new ArrayList<>();

        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM funcionario;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Funcionario funcionario = new Funcionario();
                    funcionario.setCodFun(rs.getInt(1));
                    funcionario.setNome(rs.getString(2));
                    funcionario.setTelefone(rs.getString(3));
                    funcionario.setCpf(rs.getString(4));
                    funcionario.setRg(rs.getString(5));
                    lFun.add(funcionario);
                }
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return lFun;
    }

    //Método para obter um Funcionario específico do banco de dados
    public Funcionario get(int codFun) {
        Funcionario funcionario = null;
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM funcionario WHERE cod_fun = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codFun);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                rs.next();
                funcionario = new Funcionario();
                funcionario.setCodFun(rs.getInt(1));
                funcionario.setNome(rs.getString(2));
                funcionario.setTelefone(rs.getString(3));
                funcionario.setCpf(rs.getString(4));
                funcionario.setRg(rs.getString(5));
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return funcionario;
    }

    //Método para alterar um Funcionario do banco de dados
    public void update(Funcionario funcionario) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "UPDATE funcionario"
                    + " SET nome = ?, telefone= ?, "
                    + "cpf = ?, rg= ?"
                    + " WHERE cod_fun = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getTelefone());
            ps.setString(3, funcionario.getCpf());
            ps.setString(4, funcionario.getRg());
            ps.setInt(5, funcionario.getCodFun());
            
            
            ps.executeUpdate();
            
            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Método para apagar um Funcionario do banco de dados
    public void delete(int codFun) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "DELETE FROM funcionario WHERE cod_fun = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codFun);
            ps.executeUpdate();
            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
