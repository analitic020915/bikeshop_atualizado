package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class testedeconexao {

    public static void main(String[] args) {
        try {
            Conexao conexao = new Conexao();
            Connection connection = conexao.getConexao();

            if (connection != null) {
                System.out.println("Conexão bem-sucedida!");

                // Aqui você pode adicionar mais lógica para testar consultas, atualizações, etc.
            } else {
                System.out.println("Falha na conexão.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
