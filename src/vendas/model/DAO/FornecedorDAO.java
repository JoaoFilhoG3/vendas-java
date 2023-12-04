package vendas.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vendas.controller.Conexao;
import vendas.model.Fornecedor;

public class FornecedorDAO {
    //Método para inserir um novo Fornecedor no banco de dados
    public void add(Fornecedor fornecedor) {
        try {

            Connection con = Conexao.abrirConexao();

            String sql
                    = "INSERT INTO "
                    + "fornecedor (nome_fantasia, razao_social, cnpj, telefone) "
                    + "VALUES (?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNomeFantasia());
            ps.setString(2, fornecedor.getRazaoSocial());
            ps.setString(3, fornecedor.getCnpj());
            ps.setString(4, fornecedor.getTelefone());

            ps.executeUpdate();

            Conexao.fecharConexao(con);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    //Método para listar todos os Fornecedores do banco de dados
    public List<Fornecedor> getAll() {
        List<Fornecedor> lFor = new ArrayList<>();

        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM fornecedor;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor.setCodFor(rs.getInt(1));
                    fornecedor.setNomeFantasia(rs.getString(2));
                    fornecedor.setRazaoSocial(rs.getString(3));
                    fornecedor.setCnpj(rs.getString(4));
                    fornecedor.setTelefone(rs.getString(5));
                    lFor.add(fornecedor);
                }
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return lFor;
    }

    //Método para obter um Fornecedor específico do banco de dados
    public Fornecedor get(int codFor) {
        Fornecedor fornecedor = null;
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM fornecedor WHERE cod_for = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codFor);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                rs.next();
                fornecedor = new Fornecedor();
                fornecedor.setCodFor(rs.getInt(1));
                fornecedor.setNomeFantasia(rs.getString(2));
                fornecedor.setRazaoSocial(rs.getString(3));
                fornecedor.setCnpj(rs.getString(4));
                fornecedor.setTelefone(rs.getString(5));
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return fornecedor;
        
    }

    //Método para alterar um Fornecedor do banco de dados
    public void update(Fornecedor fornecedor) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "UPDATE fornecedor"
                    + " SET nome_fantasia = ?, razao_social= ?, "
                    + "cnpj = ?, telefone = ?"
                    + " WHERE cod_for = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNomeFantasia());
            ps.setString(2, fornecedor.getRazaoSocial());
            ps.setString(3, fornecedor.getCnpj());
            ps.setString(4, fornecedor.getTelefone());
            ps.setInt(5, fornecedor.getCodFor());
            
            
            ps.executeUpdate();
            
            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Método para apagar um Fornecedor do banco de dados
    public void delete(int codFor) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "DELETE FROM fornecedor WHERE cod_for = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codFor);
            ps.executeUpdate();
            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
