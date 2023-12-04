package vendas.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vendas.controller.Conexao;
import vendas.model.Cliente;
import vendas.model.Produto;

public class ProdutoDAO {

    //Método para inserir um novo Produto no banco de dados
    public void add(Produto produto) {
        try { 

            Connection con = Conexao.abrirConexao();

            String sql = "INSERT INTO "
                    + "produto (nome, cod_barras, valor, estoque, cod_for) "
                    + "VALUES (?, ?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setInt(2, produto.getCodBarras());
            ps.setDouble(3, produto.getValor());
            ps.setInt(4, produto.getEstoque());
            ps.setInt(5, produto.getFornecedor().getCodFor());

            ps.executeUpdate();

            Conexao.fecharConexao(con);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    //Método para listar todos os Produtos do banco de dados
    public List<Produto> getAll() {
        List<Produto> lPro = new ArrayList<>();

        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM produto;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            FornecedorDAO FDAO = new FornecedorDAO();
            if (rs != null) {
                while (rs.next()) {
                    Produto p = new Produto();
                    p.setCodPro(rs.getInt(1));
                    p.setNome(rs.getString(2));
                    p.setCodBarras(rs.getInt(3));
                    p.setValor(rs.getDouble(4));
                    p.setEstoque(rs.getInt(5));
                    p.setFornecedor(FDAO.get(rs.getInt(6)));
                    lPro.add(p);
                }
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return lPro;
    }

    //Método para obter um Produto específico do banco de dados
    public Produto get(int codPro) {
        Produto produto = null;
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "SELECT * FROM produto WHERE cod_pro = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codPro);
            ResultSet rs = ps.executeQuery();
            FornecedorDAO FDAO = new FornecedorDAO();
            if (rs != null) {
                rs.next();
                produto = new Produto();
                produto.setCodPro(rs.getInt(1));
                produto.setNome(rs.getString(2));
                produto.setCodBarras(rs.getInt(3));
                produto.setValor(rs.getDouble(4));
                produto.setEstoque(rs.getInt(5));
                produto.setFornecedor(FDAO.get(rs.getInt(6)));
            }
            Conexao.fecharConexao(con);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return produto;
    }

    //Método para alterar um Produto do banco de dados
    public void update(Produto produto) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "UPDATE produto"
                    + " SET nome = ?, cod_barras = ?, valor = ?, estoque = ?, cod_for = ?"
                    + " WHERE cod_pro = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setInt(2, produto.getCodBarras());
            ps.setDouble(3, produto.getValor());
            ps.setInt(4, produto.getEstoque());
            ps.setInt(5, produto.getFornecedor().getCodFor());
            ps.setInt(6, produto.getCodPro());

            ps.executeUpdate();

            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Método para apagar um Produto do banco de dados
    public void delete(int codPro) {
        try {
            Connection con = Conexao.abrirConexao();
            String sql = "DELETE FROM produto WHERE cod_pro = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codPro);
            ps.executeUpdate();
            Conexao.fecharConexao(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
