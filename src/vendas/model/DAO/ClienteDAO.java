package vendas.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vendas.controller.Conexao;
import vendas.model.Cliente;

public class ClienteDAO {

    //Método para inserir um novo Cliente no banco de dados
    public void add(Cliente cliente) {
        try { 

            Connection con = Conexao.abrirConexao();

            String sql = "INSERT INTO "
                    + "cliente (nome, endereco, telefone, cpf, rg) "
                    + "VALUES (?, ?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getCpf());
            ps.setString(5, cliente.getRg());

            ps.executeUpdate();

            Conexao.fecharConexao(con);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    //Método para listar todos os Clientes do banco de dados
    public List<Cliente> getAll() {
        List<Cliente> lCli = new ArrayList<>();

        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM cliente;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente c = new Cliente();
                    c.setCodCli(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    c.setEndereco(rs.getString(3));
                    c.setTelefone(rs.getString(4));
                    c.setCpf(rs.getString(5));
                    c.setRg(rs.getString(6));
                    lCli.add(c);
                }
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return lCli;
    }

    //Método para obter um Cliente específico do banco de dados
    public Cliente get(int codCli) {
        Cliente cliente = null;
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM cliente WHERE cod_cli = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCli);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                rs.next();
                cliente = new Cliente();
                cliente.setCodCli(rs.getInt(1));
                cliente.setNome(rs.getString(2));
                cliente.setEndereco(rs.getString(3));
                cliente.setTelefone(rs.getString(4));
                cliente.setCpf(rs.getString(5));
                cliente.setRg(rs.getString(6));
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return cliente;
    }

    //Método para alterar um Cliente do banco de dados
    public void update(Cliente cliente) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "UPDATE cliente"
                    + " SET nome = ?, endereco = ?, telefone = ?, cpf = ?, rg = ?"
                    + " WHERE cod_cli = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getCpf());
            ps.setString(5, cliente.getRg());
            ps.setInt(6, cliente.getCodCli());

            ps.executeUpdate();

            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Método para apagar um Cliente do banco de dados
    public void delete(int codCli) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "DELETE FROM cliente WHERE cod_cli = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCli);
            ps.executeUpdate();
            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
