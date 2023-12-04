package vendas.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    /**
     * Método responsável por estabelecer 
     * a conexão com o banco de dados
     */
    public static Connection abrirConexao() {
        
        Connection con = null;
        
        try {
            String host = "localhost";
            String banco = "vendas";
            String user = "root";
            String pass = "";
            
            String url = "jdbc:mysql://" + host + "/" + banco;

            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        
        return con;
    }

    /**
     * Método responsável por fechar a conexão com o banco
     */
    public static void fecharConexao(Connection con) {
        try {
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
}
